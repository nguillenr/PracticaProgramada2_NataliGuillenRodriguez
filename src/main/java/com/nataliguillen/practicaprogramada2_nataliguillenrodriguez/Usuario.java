/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

/**
 *
 * @author natal
 */
public class Usuario implements Comparable<Usuario> {
    
    //Atributos
    private String nombreUsuario;
    private String correo;
    
    //Constructor
    public Usuario(String nombreUsuario, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    //Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Método estático para iniciar sesión
    public static void iniciarSesion(Usuario usuario) {
        System.out.println("¡Bienvenido " + usuario.getNombreUsuario() + "!");
    }
    
    //Método para comparar usuarios por nombre
@Override
public int compareTo(Usuario otroUsuario) {
    return this.nombreUsuario.compareTo(otroUsuario.nombreUsuario);
}
      
}
