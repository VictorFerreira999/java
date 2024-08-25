/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.victor.sintaxe;

/**
 *
 * @author victor
 */
public class Tipos {
     // Tipos Primitivos
   byte exemploByte = 127;                // Máximo valor para byte
   short exemploShort = 32000;            // Exemplo de short
   int exemploInt = 100000;               // Exemplo de int
   long exemploLong = 100000L;            // Exemplo de long (note o 'L')
   float exemploFloat = 3.14f;            // Exemplo de float (note o 'f')
   double exemploDouble = 3.14159;        // Exemplo de double
   char exemploChar = 'A';                // Exemplo de char (um único caractere)
   boolean exemploBoolean = true;         // Exemplo de boolean (true ou false)

   // Casting Explícito e Implícito
   int intParaByte = (byte) exemploInt;   // Casting explícito de int para byte
   int doubleParaInt = (int) exemploDouble; // Casting explícito de double para int
   float longParaFloat = (float) exemploLong; // Casting explícito de long para float
   long floatParaLong = (long) exemploFloat; // Casting explícito de float para long
   int charParaInt = exemploChar;         // Casting implícito de char para int

   // Tipos de Referência
   String exemploString = "Olá, Mundo!";  // Exemplo de String (sequência de caracteres)
   int[] exemploArray = {1, 2, 3, 4, 5};  // Exemplo de Array (coleção de inteiros)  
   
   public static void main(String[] args) {
       Tipos exemplos = new Tipos();

       // Exibindo os valores dos tipos primitivos
       System.out.println("byte: " + exemplos.exemploByte);
       System.out.println("short: " + exemplos.exemploShort);
       System.out.println("int: " + exemplos.exemploInt);
       System.out.println("long: " + exemplos.exemploLong);
       System.out.println("float: " + exemplos.exemploFloat);
       System.out.println("double: " + exemplos.exemploDouble);
       System.out.println("char: " + exemplos.exemploChar);
       System.out.println("boolean: " + exemplos.exemploBoolean);

       // Exibindo os resultados do casting
       System.out.println("Casting int para byte: " + exemplos.intParaByte);
       System.out.println("Casting double para int: " + exemplos.doubleParaInt);
       System.out.println("Casting long para float: " + exemplos.longParaFloat);
       System.out.println("Casting float para long: " + exemplos.floatParaLong);
       System.out.println("Casting char para int: " + exemplos.charParaInt);

       // Exibindo os valores dos tipos de referência
       System.out.println("String: " + exemplos.exemploString);
       System.out.println("Array: " + java.util.Arrays.toString(exemplos.exemploArray));

    }
}
