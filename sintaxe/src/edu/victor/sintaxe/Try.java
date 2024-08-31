package edu.victor.sintaxe;

public class Try {
   
      public static void main(String[] args) {
          // Simulação de uma operação que pode lançar uma exceção
          int[] numeros = {1, 2, 3};
          int indice = 5; // Índice fora do intervalo
  
          try {
              // Tentativa de acessar um índice inválido do array
              System.out.println("Acessando elemento: " + numeros[indice]);
          } catch (ArrayIndexOutOfBoundsException e) {
              // Captura a exceção e exibe uma mensagem de erro
              System.out.println("Erro: Índice fora dos limites do array.");
          } finally {
              // Este bloco sempre é executado, independentemente de uma exceção ter sido lançada ou não
              System.out.println("Bloco finally executado. Limpeza de recursos pode ser realizada aqui.");
          }
      }
}
  

