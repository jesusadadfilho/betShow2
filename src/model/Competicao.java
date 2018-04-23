package model;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Marcelo on 19/04/2018.
 */

public class Competicao {
    private static int sequence = 0;
    public long codigo;
    private String nome;
    private Fase faseToOne;
    private Categoria categoria;
    private List<Time> participantes;

    public Competicao(String nome) {
        this.codigo =  sequence++;
        this.nome =  nome;
        this.participantes = new ArrayList<>();
        
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
    
    
    /**
    * 
    * @param time
    * @return 
    */   
    public boolean addParticipante(Time time){
        if (this.ehTimeValido(time)){
            this.participantes.add(time);
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param time
     * @return 
     */
    private boolean ehTimeValido(Time time){
          return !participantes.contains(time);
    }
    

    

    @Override
    public String toString() {
        return this.codigo +"-"+ getNome();
    }
}
