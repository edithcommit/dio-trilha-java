package exercicios;

public class SmartTv {
    int volume = 25;
    int canal = 1;
    boolean ligada = false;

   public void ligarTv(){
        ligada=true;
   }

   public void desligarTv(){
        ligada=false;
   }

  public void aumentarVolume(){
     // volume = volume + 1; 
        volume++;   
  }

    public void diminuirVolume(){
        volume--;   
  }

}
