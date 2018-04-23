package model;

import java.util.Date;

/**
 * Created by Marcelo on 19/04/2018.
 */

public class Jogo {

    public long id;
    private Date data;
    Time timeMandante;
    Time timeVisitante;
    Resultado resultado;
    Fase faseToOne;
    Rodada rodada;


    public Jogo() {
    }

    public Jogo(Date data, Time timeMandante, Time timeVisitante) {
        this.data = data;
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
    }
    
    public Jogo(Time timeMandante, Time timeVisitante) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultadoToOne) {
        this.resultado = resultadoToOne;
    }

    public Fase getFaseToOne() {
        return faseToOne;
    }

    public void setFaseToOne(Fase faseToOne) {
        this.faseToOne = faseToOne;
    }

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }
}

