package BASIC.ABSTRACAO;

public class Telegram extends ServicoMensagemInstantanea {

   @Override
   public void enviarMensagem() {
      System.out.println("Mensagem enviada via telegram");      
   }

   @Override
   public void receberMensagem() {
      // TODO Auto-generated method stub
   }
   
}
