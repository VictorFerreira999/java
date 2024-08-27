/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.victor.metodo;

/**
 *
 * @author victor
 */
public class Usuario {
   public static void main(String[] args) {
      SmartTv smartTv = new SmartTv();

      System.out.println("Tv ligada ? " + smartTv.ligada);
      System.out.println("Canal atual: " + smartTv.canal);
      System.out.println("Volume atual: " + smartTv.volume);

      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.aumentarVolume();

      smartTv.ligar();
      System.out.println("Tv ligada ? " + smartTv.ligada);
      smartTv.desligar();
      System.out.println("Tv ligada ? " + smartTv.ligada);

      smartTv.mudarCanal(13);
      System.out.println("Canal atual: " + smartTv.canal);
   }
}