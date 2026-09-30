/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

/**
 *
 * @author natal
 */
public class Documental extends Audiovisual implements Comparable<Documental> {
    
    // Atributo
    private String tema;
    
    // Constructor
    public Documental(String titulo, String genero, int duracion,
            String clasificacion, String tema) {
        super(titulo, genero, duracion, clasificacion);
        this.tema = tema;
    }

    //Getter y Setter
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    
 //Método para comparar documentales por título
@Override
public int compareTo(Documental otroDocumental) {
    return this.getTitulo().compareTo(otroDocumental.getTitulo());
}   
    
}
