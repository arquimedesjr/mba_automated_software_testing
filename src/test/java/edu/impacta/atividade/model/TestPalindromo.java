package edu.impacta.atividade.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindromo {

    @Test
    public void testPalindromoIsTrue() {
        Palindromo palindromo = new Palindromo("Rotator");
        assertTrue(palindromo.validText());
    }

    @Test
    public void testPalindromoIsFalse() {
        Palindromo palindromo = new Palindromo("xyz");
        assertFalse(palindromo.validText());
    }

    @Test
    public void testPalindromoFailureNull() {
        assertThrows(IllegalArgumentException.class,() -> {
            new Palindromo(null).validText();
        });
    }

    @Test
    public void testPalindromoFailureEmpty() {
        assertThrows(IllegalArgumentException.class,() -> {
            new Palindromo("").validText();
        });
    }
}
