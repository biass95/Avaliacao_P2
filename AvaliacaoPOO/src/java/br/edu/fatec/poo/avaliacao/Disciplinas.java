/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.poo.avaliacao;

import java.util.ArrayList;

/**
 *
 * @author biancasobral
 */
public class Disciplinas {
    private String name;
    private String ementa;
    private int ciclo;
    private double nota;

    public Disciplinas(String name, String ementa, int ciclo) {
        this.name = name;
        this.ementa = ementa;
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public static ArrayList<Disciplinas> getList(){
     ArrayList<Disciplinas> list = new ArrayList<>();
     list.add(new Disciplinas("Nome 1", "Ementa 1", 6));
     list.add(new Disciplinas("Nome 2", "Ementa 2", 6));
     list.add(new Disciplinas("Nome 3", "Ementa 3", 6));
     list.add(new Disciplinas("Nome 4", "Ementa 4", 6));
     return list;
    }
    
}
