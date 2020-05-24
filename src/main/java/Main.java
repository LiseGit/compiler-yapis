import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(args[0]);
            CharStream input = CharStreams.fromStream(inputStream);
            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            CompilerVisitor visitor = new CompilerVisitor();
            String output = (String) visitor.visit(tree);

            FileWriter fileWriter = new FileWriter("Trixy.ccp");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}