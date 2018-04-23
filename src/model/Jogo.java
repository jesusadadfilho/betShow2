package model;

import java.util.Date;
import java.util.List;

/**
 * Created by Marcelo on 19/04/2018.
 */

public class Jogo {

    public long id;
    private Date data;
    private final Time timeMandante;
    private final Time timeVisitante;
    private int placarMandante;
    private int placarVisitante;
    private int status;
    private List<Aposta> apostas;
    private static int sequence = 0;

    public Jogo(Time timeMandante, Time timeVisitante) {
        this.id =  sequence++;
        this.data = new Date();
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
    }

    public Date getData() {
        return data;
    }

    public Time getTimeMandante() {
        return timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

        
    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}

