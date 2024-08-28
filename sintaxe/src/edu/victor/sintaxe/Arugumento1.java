/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.victor.sintaxe;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Arugumento1 {
   public static void main(String[] args) {
      // Criando um objeto Scanner para ler as entradas do usuário
      Scanner scanner = new Scanner(System.in);

      // Solicitando o nome do usuário
      System.out.print("Digite seu nome: ");
      String nome = scanner.nextLine();

      // Solicitando o sobrenome do usuário
      System.out.print("Digite seu sobrenome: ");
      String sobrenome = scanner.nextLine();

      // Solicitando a idade do usuário
      System.out.print("Digite sua idade: ");
      int idade = scanner.nextInt();

      // Solicitando a altura do usuário
      System.out.print("Digite sua altura em cm (ex: 175.5): ");
      double altura = scanner.nextDouble();

      // Exibindo os dados fornecidos pelo usuário
      System.out.println("\nOlá, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura + " cm");

      // Fechando o Scanner para liberar recursos
      scanner.close();
  }
}
