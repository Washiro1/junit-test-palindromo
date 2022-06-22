package com.example;

/**
 * Palíndromo
 *
 */
public class Palindromo 
{
    public static boolean validaPalidromo(String conteudo) {

        conteudo = conteudo.toUpperCase();
        conteudo = conteudo.replaceAll("[^A-Z0-9]", "");
        
        String invertida = new StringBuffer(conteudo).reverse().toString();
        
        if (conteudo.equals(invertida))
             return true; 
        else
            return false;
    }
}
