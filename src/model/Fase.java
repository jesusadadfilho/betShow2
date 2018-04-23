package model;


import java.util.Random;

/**
 * Created by Marcelo on 19/04/2018.
 */
public class Fase {
    private static int sequence = 0;
    public long id;
    private String descricao;

    public Fase(String descricao) {
        this.id = sequence++;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id +"-"+ getDescricao();
    }
}
