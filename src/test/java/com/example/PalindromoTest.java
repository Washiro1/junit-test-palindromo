package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromoTest 
{
    @Test
    public void testePalindromoRotator()
    {
        String conteudo = "Rotator";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoBob()
    {
        String conteudo = "bob";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoMadam()
    {
        String conteudo = "madam";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoMalaylam()
    {
        String conteudo = "madam";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoSingleNumber()
    {
        String conteudo = "1";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoPhrase() 
    {        
        String conteudo = "Able was I, ere I saw Elba";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoSecondPhrase()   
    {        
        String conteudo = "Madam I’m Adam";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoThirdPhrase()   
    {        
        String conteudo = "Step on no pets.";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoFourthPhrase()   
    {        
        String conteudo = "Top spot!";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoDate()   
    {        
        String conteudo = "02/02/2020";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoFifthPhrase()   
    {        
        String conteudo = "Socorram-me subi no ônibus em marrocos";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertTrue(result);
    }

    @Test
    public void testePalindromoFalse()   
    {        
        String conteudo = "xyz";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }

    @Test
    public void testePalindromoFalseSecond()   
    {        
        String conteudo = "elephant";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }

    @Test
    public void testePalindromoFalseThird()   
    {        
        String conteudo = "Country";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }

    @Test
    public void testePalindromoFalseFourth()   
    {        
        String conteudo = "Top . post!";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }

    @Test
    public void testePalindromoFalseFifth()   
    {        
        String conteudo = "Wonderful-fool";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }

    @Test
    public void testePalindromoFalseSixth()   
    {        
        String conteudo = "Wild imagination!";

        boolean result = Palindromo.validaPalidromo(conteudo);
        
        assertFalse(result);
    }
}