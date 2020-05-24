import gen.GrammarBaseVisitor;
import gen.GrammarParser;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CompilerVisitor extends GrammarBaseVisitor<String> {
    private List<String> errors = new ArrayList<>();
    private List<String> globalListVars = new ArrayList<>();
    private List<String> globalElementVars = new ArrayList<>();

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx){
        String buffer = "#include \"Trixy.h\"\n";

        String buffer1 = "";
        for (GrammarParser.Prog_declaratingContext context : ctx.prog_declarating()){
            buffer+= visitProg_declarating(context) + ";\n";
        }
        buffer += visitStart_bloc(ctx.start_bloc());
        for (GrammarParser.Prog_blockContext context : ctx.prog_block()){
            buffer+= visitProg_block(context);
        }
        return buffer;
    }
    @Override
    public String visitProg_declarating(GrammarParser.Prog_declaratingContext ctx){
        String buffer="";
        int k = ctx.type().size();
        if(ctx.DOT_DOT() != null){
            buffer+= ctx.type().get(k).getText() + " ";
        }
        else {
            buffer+="void ";
        }
        buffer+=ctx.WORD().getText();
        if(ctx.L_BR()!=null) {
            buffer+="(";
            int n;
            if(ctx.DOT_DOT()!=null) {
                n = k - 1;
            }
            else {
                n = k;
            }
            for (int index = 0; index < n; index++) {
                String type = visitType(ctx.type(index));

                if (index > 0) {
                    buffer += ",";
                }
                buffer += type;
            }
            buffer+=")";
        }
        else buffer+="()";
        return buffer;
    }

    @Override
    public String visitStart_bloc(GrammarParser.Start_blocContext ctx){
        String buffer="int main()\n";
        buffer+=visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx){
        String buffer="{\n";
        for(int index=0; index<ctx.act().size(); index++){
            buffer+=visitAct(ctx.act().get(index));
        }
        buffer+="}\n";
        return buffer;
    }

    @Override
    public String visitAct(GrammarParser.ActContext ctx){
        String buffer="";
        if(ctx.declaration()!=null){
            buffer+=visitDeclaration(ctx.declaration());
        }
        else if(ctx.departed_fill()!=null){
            buffer+=visitDeparted_fill(ctx.departed_fill());
        }
        else {
            buffer+=visitFunction(ctx.function());
        }
        buffer+=";\n";
        return buffer;
    }

    @Override
    public String visitDeclaration(GrammarParser.DeclarationContext ctx){
        String buffer=ctx.type().getText()+" ";
        int k=0;
        for(int index=0; index<ctx.declarat().size(); index++){
            if(index>0){
                buffer+=",";
            }
            buffer+=ctx.declarat().get(index).getText();
        }
        return buffer;
    }
    @Override
    public String visitDeparted_fill(GrammarParser.Departed_fillContext ctx) {
        String buffer = ctx.WORD().getText();
        int k = 0;
        if (ctx.L_CBR() != null) {
            buffer += "[" + visitExtraction(ctx.extraction().get(0)) + "]";
            k++;
        }
        buffer += "=" + visitExtraction(ctx.extraction().get(k));
        return buffer;
    }

    @Override
    public String visitExtraction(GrammarParser.ExtractionContext ctx){
        String buffer ="";
        if(ctx.MINUS()!=null){
            buffer+="-(";
            if(ctx.simple_extraction()!=null){
                buffer+=visitSimple_extraction(ctx.simple_extraction());
            }
            else {
                buffer+=visitVector_fill(ctx.vector_fill());
            }
            buffer+=")";
        }
        else if(ctx.simple_extraction()!=null){
            buffer+=visitSimple_extraction(ctx.simple_extraction());
        }
        else if(ctx.vector_fill()!=null){
            buffer+=visitVector_fill(ctx.vector_fill());
        }
        else {
            buffer+=visitOperation_extraction(ctx.operation_extraction());
        }
        return buffer;
    }
    public String visitSimple_extraction(GrammarParser.Simple_extractionContext ctx){
        String buffer="";
        if(ctx.MINUS()!=null){
            buffer+="-";
        }
        if(ctx.V_LINE()!=null){
            buffer+="norm("+visitExtraction(ctx.extraction().get(0))+")";
        }
        else if (ctx.L_CBR()!=null){
            if(ctx.WORD()!=null){
                buffer+=ctx.WORD()+"["+visitExtraction(ctx.extraction().get(0))+"]";
            }
            else{
                buffer+=visitExtraction(ctx.extraction().get(0))+"["+visitExtraction(ctx.extraction().get(1))+"]";
            }
        }
        return buffer;
    }
}