package org.example;
import java.util.Random;

public class BuzzLightyear {
    private boolean capacete_aberto;
    private boolean dispara_laser;
    private boolean abre_asas;
    private Random golpe;

    public BuzzLightyear(){
        this.capacete_aberto = false;
        this.dispara_laser = false;
        this.abre_asas = false;
        this.golpe = new Random();
    }

    public boolean CapaceteEstaAberto(){
        return this.capacete_aberto;
    }

    public void setCapaceteAberto(boolean capacete_aberto){
        this.capacete_aberto = capacete_aberto;
    }

    public boolean EstaDisparandoLaser(){
        return this.dispara_laser;
    }

    public void setDisparaLaser(boolean dispara_laser){
        this.dispara_laser = dispara_laser;
    }

    public boolean EstaComAsasAbertas(){
        return this.abre_asas;
    }

    public void setAbreAsas(boolean abre_asas){
        this.abre_asas = abre_asas;
    }

    public int RealizaGolpe(){
        return this.golpe.nextInt(10); //O golpe é interpretado como se fosse um movimento de RPG de um dado D10
    }

    public String Frases(){
        Random rand = new Random();
        int frase = rand.nextInt(6);

        switch (frase) {
            case 0:
                return "Ao infinito, e além!";
            case 1:
                return "Eu sou seu Buzz Lightyear.";
            case 2:
                return "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.";
            case 3:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
            case 4:
                return "Isto não é voar. Isto é cair, com estilo!";
            case 5:
                return "Onde?";
            default:
                return "";
        }
    }
}
