/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Marcos
 */
public class Calculadora {
    public int soma(int x, int y) {
        return x + y;
    }
    
    public int subtracao(int x, int y) {
        return x - y;
    }
    
    public int multiplicacao(int x, int y) {
        return x * y;
    }
    
    public double divisao(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("A divisão por zero não é possivel");
        }
        return (double) x / y;
    }
}
