package exercicios;

public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo Status -> Tv ligada: " + smartTv.ligada); 

        smartTv.desligarTv();
        System.out.println("Novo Status -> Tv ligada: " + smartTv.ligada); 



    }

}
