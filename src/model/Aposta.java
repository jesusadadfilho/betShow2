package model;

/**
 * Created by Marcelo on 19/04/2018.
 */
public class Aposta {
    public long id;
    Jogo partida;
    Bilhete bilheteDono;
    public int palpite;


    public Aposta(Jogo partida) {
    	this.partida = partida;
    }

    public Jogo getPartida() {
        return partida;
    }

    public void setPartida(Jogo partida) {
        this.partida = partida;
    }

    public Bilhete getBilheteDono() {
        return bilheteDono;
    }

    public void setBilheteDono(Bilhete bilheteDono) {
        this.bilheteDono = bilheteDono;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }
}
