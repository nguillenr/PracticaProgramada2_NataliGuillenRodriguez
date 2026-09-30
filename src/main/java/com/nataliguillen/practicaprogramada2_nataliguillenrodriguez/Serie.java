/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

/**
 *
 * @author natal
 */
public class Serie extends Audiovisual implements Comparable<Serie> {
    
    //Atributo
    private int numeroTemporadas;
    
    //Constructor
    public Serie(String titulo, String genero, int duracion,
            String clasificacion, int numeroTemporadas) {
        super(titulo, genero, duracion, clasificacion);
        this.numeroTemporadas = numeroTemporadas;
    }

    //Getter y Setter
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    
    //Método para comparar series por título
@Override
public int compareTo(Serie otraSerie) {
    return this.getTitulo().compareTo(otraSerie.getTitulo());
}
    
}
