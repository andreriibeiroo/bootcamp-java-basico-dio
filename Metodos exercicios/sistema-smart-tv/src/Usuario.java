public class Usuario {
    public static void main(String[] args) throws Exception {
    
    SmartTv smartTv = new SmartTv();
    
    smartTv.ligada = true;

    if (smartTv.ligada == true) {
        System.out.println("TV ligada \n");
    }
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    System.out.println("Canal "+smartTv.canal);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.dimunuirCanal();


  
    }
}

