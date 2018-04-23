package model;

import java.util.Date;
import java.util.List;

/**
 * Created by Marcelo on 19/04/2018.
 */

public class Bilhete {

    public long id;
    private Apostador dono;
    private static List<Aposta> apostas;
    private String local;
    private Date dia;
    private static Rodada rodada;

    public Bilhete(long id, Apostador dono, List<Aposta> apostas, Rodada rodada) {
        this.id = id;
        this.dono = dono;
        this.apostas = apostas;
        this.rodada = rodada;
    }

    public Bilhete() {
    }

    public Apostador getDono() {
        return dono;
    }

    public void setDono(Apostador dono) {
        this.dono = dono;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
    
    public static boolean vencedor() {
    	for(int i = 0; i < apostas.size(); i++) {
    		if(!apostas.get(i).equals(rodada.listaJogos.get(i).resultado.getResultado())) {
    			return  false;
    		}
    	}
		return true;
    }
}
