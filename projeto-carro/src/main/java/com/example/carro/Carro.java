package com.example.carro;

public class Carro extends Veiculo {
private String cor;  
private String modelo;

public Carro(String cor, String modelo) {
    super();
    this.cor = cor;
    this.modelo = modelo;
}

public String getCor() {
    return cor;

}

public void setCor(String cor) {
    this.cor = cor;

}

public String getModelo() {
    return modelo;

}

public void setModelo(String modelo) {
    this.modelo = modelo;

}

@Override
public void acelerar() {
  velocidade += 20; // carros aceleram mais forte
  System.out.println(modelo + " acelarando! Velocidade" );

}

@Override
public String toString() {
    return "Carro{" + "modelo='" + modelo + 
    '\'' + ", cor='" + cor + '\'' + ", velocidade=" + velocidade + '}';

}


}
