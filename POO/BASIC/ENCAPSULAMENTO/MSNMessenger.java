public class MSNMessenger {
   public void enviarMensagem() {
      validarConectadoInternet();
      System.out.println("Enviando");
      salvandoHistoricoMensagem();
   }

   public void receberMensagem(){
      System.out.println("Recebendo mensagem");
   }

   private void validarConectadoInternet(){
      System.out.println("Validando se está conectado a internet");
   }

   private void salvandoHistoricoMensagem(){
      System.out.println("Salvando o historico da mensagem");
   }
}
