package org.example;

public class Contador{
    private int contador;

    public Contador(){
        this.contador = 0;
    }

    public int GetContador(){
        return contador;
    }

    public void Incrementador(){
        this.contador++;
    }
}