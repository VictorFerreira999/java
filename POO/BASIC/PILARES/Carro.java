public class Carro extends Veiculo {
   

   public void ligar(){
      confereCambio();
      confereCombustivel();
      System.out.println("Carro ligado");
   }

   private void confereCombustivel(){
      System.out.println("COnferindo combustivél");
   }

   private void confereCambio(){
      System.out.println("Conferindo o cambio");
   }
}
