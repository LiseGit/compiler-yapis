#pragma once

#ifndef TRIXY_H
#define TRIXY_H

#include <iostream>
#include <vector>

using namespace std;

typedef vector <vector <double>> matrix;

vector <double> vectorplus(vector<double>, vector<double>);
vector <double> vectorminus(vector<double>, vector<double>);
vector <double> numbvector(double, vector<double>);
double vectormult(vector<double>, vector<double>);
double norm(vector<double>);

matrix matrixplus(matrix, matrix);
matrix matrixminus(matrix, matrix);
matrix numbmatrix(double, matrix);
matrix matrixmult(matrix, matrix);
double norm(matrix);
matrix vectormultmatrix(vector<double>, matrix);

void print(double);
void print(vector<double>);
void print(matrix);

vector <double> vectorplus(vector<double> v1, vector<double> v2)
{
    vector<double> res(v1.size());
    for (int i = 0; i < v1.size(); i++)
    {
        res[i] = v1[i] + v2[i];
    }
    return res;
}

vector <double> vectorminus(vector<double> v1, vector<double> v2)
{
    vector<double> res(v1.size());
    for (int i = 0; i < v1.size(); i++)
    {
        res[i] = v1[i] - v2[i];
    }
    return res;
}

vector <double> numbvector(double n, vector<double> v)
{
    vector<double> res(v.size());
    for (int i = 0; i < v.size(); i++)
    {
        res[i] = n * v[i];
    }
    return res;
}

double vectormult(vector<double> v1, vector<double> v2)
{
    double res = 0;
    for (int i = 0; i < v1.size(); i++)
    {
        res += v1[i] * v2[i];
    }
    return res;
}
double norm(vector<double> v)
{
    double res = 0;
    for (int i = 0; i < v.size(); i++)
    {
        res += v[i] * v[i];
    }
    return sqrt(res);
}

matrix matrixplus(matrix m1, matrix m2)
{
    matrix res(m1.size());
    for (int i = 0; i < m1.size(); i++)
    {
        res[i] = vectorplus(m1[i], m2[i]);
    }
    return res;
}
matrix matrixminust(matrix m1, matrix m2)
{
    matrix res(m1.size());
    for (int i = 0; i < m1.size(); i++)
    {
        res[i] = vectorminus(m1[i], m2[i]);
    }
    return res;
}
matrix numbmatrix(double n, matrix m)
{
    matrix res(m.size());
    for (int i = 0; i < m.size(); i++)
    {
        res[i] = numbvector(n, m[i]);
    }
    return res;
}
matrix matrixmult(matrix m1, matrix m2)
{
    matrix res(m1.size());
    for (int i = 0; i < m1.size(); i++)
        for (int j = 0; j < m2[0].size(); j++) {
            res[i][j] = 0;
            for (int k = 0; k < m1[0].size(); k++)
                res[i][j] += m1[i][k] * m2[k][j];
        }
    return res;
}
double norm(matrix mat)
{
    double res = 0;
    for (int i = 0; i < mat.size(); i++) {
        for (double item : mat[i]) {
            res += item * item;
        }
    }
    return sqrt(res);
}

matrix vectormultmatrix(vector<double> v, matrix m)
{
    matrix res(1);
    for (int j = 0; j < m[0].size(); j++) {
        res[0][j] = 0;
        for (int k = 0; k < m[0].size(); k++)
            res[0][j] += v[k] * m[k][j];
    }
    return res;
}

void print(double a)
{
    cout << a << endl;
}
void print(vector <double> v)
{
    for (int i = 0; i < v.size(); i++)
        cout << v[i] << "   ";
    cout << endl;
}
void print(matrix m)
{
    for (int i = 0; i < m.size(); i++)
        print(m[i]);
    cout << endl;
}
#endif