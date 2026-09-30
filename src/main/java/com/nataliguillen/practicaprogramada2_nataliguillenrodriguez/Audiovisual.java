/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public abstract class Audiovisual {
    
    //Atributos 
    private String titulo;
    private String genero;
    private int duracion; //Duración en minutos
    private String clasificacion;
    private static ArrayList<String> comentarios = new ArrayList<>();
    
    //Constructor 
public Audiovisual(String titulo, String genero, int duracion, String clasificacion) {
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
    this.clasificacion = clasificacion;
}

    //Método para agregar comentarios
public static void agregarComentario(String comentario) {
    comentarios.add(comentario);
}

public static ArrayList<String> getComentarios() {
    return comentarios;
}

    //Getters y Setters 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    } 
    
}
