package model;


/**
 * Created by Marcelo on 19/04/2018.
 */

public class Competicao {
    private static int sequence = 0;
    public long codigo;
    private String nome;
    private Fase faseToOne;
    private Categoria categoria;

    public Competicao() {
        this.codigo =  sequence++;
    }

    public long getCodigo() {
        return codigo;
    }

    public Fase getFaseToOne() {
        return faseToOne;
    }

    public void setFaseToOne(Fase faseToOne) {
        this.faseToOne = faseToOne;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.codigo +"-"+ getNome();
    }
}
