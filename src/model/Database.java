package model;

import model.Categoria;
import model.Fase;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<Fase> fases;
    public List<Categoria> categorias;
    public List<Time> times;

    public Database() {
        this.fases = new ArrayList();
        setFases();
        this.categorias = new ArrayList();
        setCategorias();
        this.times = new ArrayList();
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases() {
        this.fases.add(new Fase("Grupo"));
        this.fases.add(new Fase("Eliminatória"));
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias() {
        this.categorias.add(new Categoria("Mundial"));
        this.categorias.add(new Categoria("Continental"));
        this.categorias.add(new Categoria("Nacional"));
        this.categorias.add(new Categoria("Regional"));
        this.categorias.add(new Categoria("Estadual"));
    }
}
