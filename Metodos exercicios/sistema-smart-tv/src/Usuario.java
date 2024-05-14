import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    SmartTv smartTv = new SmartTv();
    
    smartTv.ligada = true;

    System.out.println("TV ligada! \n"); 

    
    System.out.println("Digite o volume desejado! ");
    int aumentarVolume = scanner.nextInt();
    
    
    System.out.println("===============");

    System.out.println("Canal "+smartTv.canal);

    smartTv.aumentarCanal();
  
    }
}

