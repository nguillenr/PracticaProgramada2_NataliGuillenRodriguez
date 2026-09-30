/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

/**
 *
 * @author natal
 */
public class Pelicula extends Audiovisual implements Comparable<Pelicula>  {
    
    //Atributo 
    private String director;

    //Constructor
    public Pelicula(String titulo, String genero, int duracion,
                    String clasificacion, String director) {
        super(titulo, genero, duracion, clasificacion);
        this.director = director;
    }

    //Getter y Setter 
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }   
    
    //Método para comparar películas por título
@Override
public int compareTo(Pelicula otraPelicula) {
    return this.getTitulo().compareTo(otraPelicula.getTitulo());
}
    
}
