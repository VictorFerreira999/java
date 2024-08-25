public class MinhaClasse {
   
   public static void main(String[] args) {
      //System.out.print("Hello world");
      String meuNome = "Victor";
      int anoFabricacao = 2022;
      boolean verdadeira = false;
      anoFabricacao = 2018;

      String primeiroNome = "Victor";
      String segundoNome = "Ferreira";

      String nomeCOmpleto = nomeCompleto(primeiroNome, segundoNome);
      System.out.println(nomeCOmpleto);
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome) {
      return primeiroNome.concat(" ").concat(segundoNome);

   }

}
