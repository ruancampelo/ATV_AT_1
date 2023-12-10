package org.example;

import org.junit.jupiter.api.Test;

import static org.example.NumerosComplexos.*;
import static org.junit.jupiter.api.Assertions.*;

class NumerosComplexosTest {

    @Test
    void when_obterNumeros() {

        String str1 = "2+3i";
        String str2 = "5+1i";

        obterNumeros(str1);
        obterNumeros(str2);

        int[] valuesArrayTest = {2,3,5,1};

        assertArrayEquals(valuesArray, valuesArrayTest);
    }

    @Test
    void when_soma() {

        valuesArray[0] = 2;
        valuesArray[1] = 3;
        valuesArray[2] = 1;
        valuesArray[3] = 2;

        String  result = Soma();

        assertEquals("3+5i", result);
    }

    @Test
    void when_subtrair() {

        valuesArray[0] = 2;
        valuesArray[1] = 3;
        valuesArray[2] = 1;
        valuesArray[3] = 2;

        String  result = Subtrair();


        assertEquals("1+1i", result);
    }

    @Test
    void when_modulo() {

        valuesArray[0] = 2;
        valuesArray[1] = 3;
        valuesArray[2] = 1;
        valuesArray[3] = 2;

        String  result = Modulo();

        assertEquals("√13, √5", result);
    }
}