public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    
public void mudarCanal(int novoCanal){
    canal = novoCanal;
}


public void aumentarCanel(){
    canal++;
    
}
public void diminuirCanal(){ 
    canal--;

}


public void aumentarVolume() {
    volume++;
    System.out.println("Aumentar Volume" + volume);
    // volume = volume +1;

}

public void diminuirVolume() {
    volume--;
    System.out.println("Diminuir Volume" + volume);
    // volume = volume -1;

}



public void ligar()  {
    ligada=true;
}

public void desligar() {
    ligada=false;



}

}
