/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testes;

/**
 *
 * @author Marcos
 */

import com.mycompany.calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTestes {
    private final Calculadora calculadora = new Calculadora();

    // Testes da soma
    @Test
    void testarSoma() {
        assertEquals(5, calculadora.soma(7, 3));
        assertEquals(-1, calculadora.soma(2, -3));
        assertEquals(0, calculadora.soma(0, 0));
    }

    // Testes da subtração
    @Test
    void testarSubtracao() {
        assertEquals(1, calculadora.subtracao(3, 2));
        assertEquals(5, calculadora.subtracao(2, -3));
        assertEquals(0, calculadora.subtracao(0, 0));
    }

    // Testes da multiplicação
    @Test
    void testarMultiplicacao() {
        assertEquals(6, calculadora.multiplicacao(3, 7));
        assertEquals(-6, calculadora.multiplicacao(2, -3));
        assertEquals(0, calculadora.multiplicacao(0, 3));
    }

    // Testes da divisão
    @Test
    void testarDividisao() {
        assertEquals(2.0, calculadora.divisao(6, 3));
        assertEquals(-2.0, calculadora.divisao(6, -3));
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(1, 0));
    }
}
