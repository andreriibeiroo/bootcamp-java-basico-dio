import java.util.concurrent.ThreadLocalRandom;

public class candidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "MARCIA", "PAULO", "JORGE", "LUCAS", "ANDRÉ", "CARLOS", "FELIPE", "MONICA", "MIRELA",
                "DANIELA" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "O(A) candidato(a) " + candidato + " solicitou esse valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
            }
            candidatosSelecionados++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDITADO! ");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANTIDITADO COM UMA CONTRA PROPOSTA! ");
        } else {
            System.out.println("AGUARDANDO OS DEMAIS CANDITADOS! ");
        }

    }

}
