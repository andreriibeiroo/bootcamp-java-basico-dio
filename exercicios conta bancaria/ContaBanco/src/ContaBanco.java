import java.util.Locale;
import java.util.Scanner;

public class ContaBanco{
public static void main(String[] args) {

    int numeroUsuario;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da agência: ");
    agencia = scanner.nextLine();
    System.out.println("Digite o número do seu usuário: ");
    numeroUsuario = scanner.nextInt();
    System.out.println("Digite seu nome: ");
    nomeCliente = scanner.next();
    System.out.println("");

    System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " 
    +agencia+ ", conta " +numeroUsuario+ ", e seu saldo é de " +saldo+ ", que já esta disponível para saque!");
    



    }
}