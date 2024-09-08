package BASIC.HERENCA;

public class ServicoMensagemInstantanea {
   public void enviarMensagem() {
      //primeiro confirmar se esta conectado a internet
      validarConectadoInternet();
      System.out.println("Enviando mensagem");
      salvarHistoricoMensagem();
   }

   public void receberMensagem() {
      System.out.println("Recebendo mensagem");
   }
   //métodos privados, visiveis somente na classe
   private void validarConectadoInternet(){
      System.out.println("Validando se está conectado a internet");
   }

   private void salvarHistoricoMensagem() {
      System.out.println("Salvando o historico de mensagem");
   }
}
