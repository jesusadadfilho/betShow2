package model;


/**
 * Created by Marcelo on 19/04/2018.
 */
public class Categoria {

    private static int sequence = 0;

    public long id;
    private String descricao;


    public Categoria(String descricao) {
        this.id =  sequence++;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
 
    @Override
    public String toString() {
        return this.id +"-"+ getDescricao();
    }
}
