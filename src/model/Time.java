package model;


/**
 * Created by Marcelo on 19/04/2018.
 */

public class Time {

    public long id;
    private String nome;
    private static int sequence = 0;


    public Time(String nome) {
        this.id = sequence++;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
         return this.id +"-"+ getNome();
    }
    
    
}
