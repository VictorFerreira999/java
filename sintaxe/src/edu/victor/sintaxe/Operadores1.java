/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.victor.sintaxe;

/**
 *
 * @author victor
 */
public class Operadores1 {
    
   public static void main(String[] args) {
      // Operadores Aritméticos
      int a = 10;
      int b = 5;
      System.out.println("Adição: " + (a + b));          // Soma
      System.out.println("Subtração: " + (a - b));       // Subtração
      System.out.println("Multiplicação: " + (a * b));   // Multiplicação
      System.out.println("Divisão: " + (a / b));         // Divisão
      System.out.println("Módulo: " + (a % b));          // Resto da divisão

      // Operadores de Atribuição
      int c = 10;
      c += 5;  // c = c + 5
      System.out.println("Atribuição += : " + c);
      c -= 3;  // c = c - 3
      System.out.println("Atribuição -= : " + c);
      c *= 2;  // c = c * 2
      System.out.println("Atribuição *= : " + c);
      c /= 2;  // c = c / 2
      System.out.println("Atribuição /= : " + c);
      c %= 3;  // c = c % 3
      System.out.println("Atribuição %= : " + c);

      // Operadores Relacionais
      System.out.println("Igual a: " + (a == b));    // Verifica se a é igual a b
      System.out.println("Diferente de: " + (a != b)); // Verifica se a é diferente de b
      System.out.println("Maior que: " + (a > b));    // Verifica se a é maior que b
      System.out.println("Menor que: " + (a < b));    // Verifica se a é menor que b
      System.out.println("Maior ou igual a: " + (a >= b)); // Verifica se a é maior ou igual a b
      System.out.println("Menor ou igual a: " + (a <= b)); // Verifica se a é menor ou igual a b

      // Operadores Lógicos
      boolean x = true;
      boolean y = false;
      System.out.println("E lógico (AND): " + (x && y)); // Retorna true se ambos x e y são true
      System.out.println("Ou lógico (OR): " + (x || y)); // Retorna true se pelo menos um de x ou y é true
      System.out.println("Não lógico (NOT): " + (!x));   // Inverte o valor de x

      // Operadores Unários
      int d = 10;
      System.out.println("Incremento: " + (++d)); // Incrementa d e depois retorna o valor
      System.out.println("Decremento: " + (--d)); // Decrementa d e depois retorna o valor

      // Operadores Ternários
      int e = 5;
      String resultado = (e > 0) ? "Positivo" : "Negativo ou zero";
      System.out.println("Operador Ternário: " + resultado);

   }

}
