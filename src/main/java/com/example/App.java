package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        String conteudo;
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        conteudo = ler.next();
        if (Palindromo.validaPalidromo(conteudo) == true)
            System.out.println("É palíndromo.");
        else 
            System.out.println("Não é palíndromo.");
        ler.close();
    }
}
