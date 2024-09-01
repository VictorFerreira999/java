import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    // Lista para armazenar os candidatos selecionados
    private static List<String> candidatosSelecionados = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        selecaoCandidatos();  // Chama o método de seleção de candidatos
        imprimirSelecionados();  // Chama o método para imprimir os selecionados
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "Ana Clara", "Carlos Silva", "Juliana Costa", "Pedro Almeida",
            "Fernanda Lima", "Ricardo Gomes", "Beatriz Martins", "Luís Fernando",
            "Sofia Pereira", "Mateus Oliveira"
        };

        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados.add(candidato);  // Adiciona o candidato à lista de selecionados
                candidatosSelecionadosCount++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        System.out.println("Imprimindo os candidatos selecionados:");
        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }
    }
}
