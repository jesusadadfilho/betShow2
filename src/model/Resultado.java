package model;

import java.util.Random;

/**
 * Created by Marcelo on 19/04/2018.
 */


public class Resultado {

    public long id;
    private int resultadoMandante;
    private int resultadoVisitante;
    Random gerator = new Random();

    public Resultado() {
    	gerarResultado();
    }

    public int getResultadoMandante() {
        return resultadoMandante;
    }

    public void setResultadoMandante(int resultadoMandante) {
        this.resultadoMandante = resultadoMandante;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }
    
    private void gerarResultado() {
    	this.resultadoMandante = gerator.nextInt(5);
    	this.resultadoVisitante = gerator.nextInt(5);
    }
    
    public String getResultado() {
    	if(this.resultadoMandante > this.resultadoVisitante) {
    		return "Vitoria da casa";
    	}else if(this.resultadoVisitante > this.resultadoMandante) {
    		return "Vitoria do visitante";
    	}else {
    		return "Empate";
    	}
    }
    
    public int getValorDoResultado() {
    	if(this.resultadoMandante > this.resultadoVisitante) {
    		return 1;
    	}else if(this.resultadoVisitante > this.resultadoMandante) {
    		return 2;
    	}else {
    		return 0;
    	}
    }
    
    
}
