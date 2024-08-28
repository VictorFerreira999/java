/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.victor.sintaxe;

/**
 *
 * @author victor
 * @version 1.0
 * @since 2024-08-26
 */
public class JavaDoc {
    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro número a ser somado
     * @param b o segundo número a ser somado
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
      return a + b;
  }

  /**
   * Subtrai um número de outro.
   *
   * @param a o número do qual será subtraído
   * @param b o número a ser subtraído de a
   * @return o resultado da subtração de b de a
   */
  public int subtrair(int a, int b) {
      return a - b;
  }

  /**
   * Método principal para executar o exemplo.
   *
   * @param args argumentos da linha de comando
   */
  public static void main(String[] args) {
      JavaDoc operacoes = new JavaDoc();
      System.out.println("Soma: " + operacoes.somar(10, 5));
      System.out.println("Subtração: " + operacoes.subtrair(10, 5));
  }
}
