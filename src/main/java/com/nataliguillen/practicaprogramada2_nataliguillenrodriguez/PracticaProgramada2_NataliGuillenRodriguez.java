/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nataliguillen.practicaprogramada2_nataliguillenrodriguez;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class PracticaProgramada2_NataliGuillenRodriguez {

    public static void main(String[] args) {
        
        //Título de la aplicación
        System.out.println("===== FIDEFLIX =====");
        
        //Crear objeto Usuario
        Usuario usuario1 = new Usuario("Natali", "natali@gmail.com");
        Usuario usuario2 = new Usuario("Carlos", "carlos@gmail.com");
        Usuario usuario3 = new Usuario("Ana", "ana@gmail.com");
        Usuario usuario4 = new Usuario("Luis", "luis@gmail.com");
        Usuario usuario5 = new Usuario("Maria", "maria@gmail.com");
        Usuario usuario6 = new Usuario("Pedro", "pedro@gmail.com");
        Usuario usuario7 = new Usuario("Sofia", "sofia@gmail.com");
        Usuario usuario8 = new Usuario("Daniel", "daniel@gmail.com");
        Usuario usuario9 = new Usuario("Laura", "laura@gmail.com");
        Usuario usuario10 = new Usuario("Andres", "andres@gmail.com");  
        
        //Iniciar sesión del usuario
        Usuario.iniciarSesion(usuario1);
        
        //Crear colección de usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();

        //Agregar usuarios a la colección
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        usuarios.add(usuario6);
        usuarios.add(usuario7);
        usuarios.add(usuario8);
        usuarios.add(usuario9);
        usuarios.add(usuario10);
        
        //Eliminar un usuario de la colección
        try {
            if (usuarios.contains(usuario5)) {
                usuarios.remove(usuario5);
                System.out.println("Usuario eliminado: " + usuario5.getNombreUsuario());
            } else {
                throw new UsuarioNoExisteException("El usuario no existe en la colección.");
            }
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        
      //Intentar eliminar nuevamente un usuario que ya no existe
        try {
            if (usuarios.contains(usuario5)) {
                usuarios.remove(usuario5);
                System.out.println("Usuario eliminado: " + usuario5.getNombreUsuario());
            } else {
                throw new UsuarioNoExisteException("El usuario no existe en la coleccion.");
            }
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }  
        
        //Ordenar la colección de usuarios
        usuarios.sort(null);
        
        //Mostrar usuarios ordenados
        System.out.println("\n--- Usuarios ordenados ---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombreUsuario());
        }

        //Crear objeto Pelicula
        Pelicula pelicula1 = new Pelicula("Interestelar", "Ciencia ficcion",
                169, "Mayores de 13 años", "Christopher Nolan");
        Pelicula pelicula2 = new Pelicula("Avatar", "Ciencia ficcion",
                162, "Mayores de 13 años", "James Cameron");
        Pelicula pelicula3 = new Pelicula("Titanic", "Drama",
                195, "Mayores de 13 años", "James Cameron");
        
        //Crear colección de películas
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        //Agregar películas a la colección
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        
        //Ordenar la colección de películas
        peliculas.sort(null);

        //Mostrar películas ordenadas
        System.out.println("\n--- Peliculas ordenadas ---");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
        
        //Agregar comentarios
        Audiovisual.agregarComentario("Excelente contenido");
        Audiovisual.agregarComentario("Muy recomendado");

        //Mostrar comentarios
        System.out.println("\n--- Comentarios ---");
        for (String comentario : Audiovisual.getComentarios()) {
            System.out.println(comentario);
        }
        
        //Mostrar información de la película
        System.out.println("\n--- Pelicula ---");
        System.out.println("Titulo: " + pelicula1.getTitulo());
        System.out.println("Genero: " + pelicula1.getGenero());
        System.out.println("Duracion: " + pelicula1.getDuracion() + " minutos");
        System.out.println("Clasificacion: " + pelicula1.getClasificacion());
        System.out.println("Director: " + pelicula1.getDirector());
        
        //Crear objeto Documental
        Documental documental1 = new Documental("Nuestro Planeta", "Naturaleza",
                50, "Toda la familia", "Naturaleza y vida silvestre");
        Documental documental2 = new Documental("Planeta Tierra", "Naturaleza",
        60, "Toda la familia", "Naturaleza");
        Documental documental3 = new Documental("El Universo", "Ciencia",
                45, "Toda la familia", "Espacio");
        
        //Crear colección de documentales
        ArrayList<Documental> documentales = new ArrayList<>();

        //Agregar documentales a la colección
        documentales.add(documental1);
        documentales.add(documental2);
        documentales.add(documental3);
        
        //Ordenar la colección de documentales
        documentales.sort(null);

        //Mostrar documentales ordenados
        System.out.println("\n--- Documentales ordenados ---");
        for (Documental documental : documentales) {
            System.out.println(documental.getTitulo());
        }

        //Mostrar información del documental
        System.out.println("\n--- Documental ---");
        System.out.println("Titulo: " + documental1.getTitulo());
        System.out.println("Genero: " + documental1.getGenero());
        System.out.println("Duracion: " + documental1.getDuracion() + " minutos");
        System.out.println("Clasificacion: " + documental1.getClasificacion());
        System.out.println("Tema: " + documental1.getTema());
        
        //Crear objeto Serie
        Serie serie1 = new Serie("Stranger Things", "Ciencia ficcion",
                50, "Mayores de 13 años", 4);
        Serie serie2 = new Serie("Breaking Bad", "Drama",
                47, "Mayores de 18 años", 5);
        Serie serie3 = new Serie("Dark", "Ciencia ficcion",
                60, "Mayores de 16 años", 3);
        
        //Crear colección de series
        ArrayList<Serie> series = new ArrayList<>();

        //Agregar series a la colección
        series.add(serie1);
        series.add(serie2);
        series.add(serie3);
        
        //Ordenar la colección de series
        series.sort(null);

        //Mostrar series ordenadas
        System.out.println("\n--- Series ordenadas ---");
        for (Serie serie : series) {
            System.out.println(serie.getTitulo());
        }

        //Mostrar información de la serie
        System.out.println("\n--- Serie ---");
        System.out.println("Titulo: " + serie1.getTitulo());
        System.out.println("Genero: " + serie1.getGenero());
        System.out.println("Duracion: " + serie1.getDuracion() + " minutos");
        System.out.println("Clasificacion: " + serie1.getClasificacion());
        System.out.println("Numero de temporadas: " + serie1.getNumeroTemporadas());
        
        //Limpiar las colecciones al finalizar el programa
        usuarios.clear();
        peliculas.clear();
        documentales.clear();
        series.clear();

        //Mostrar que las colecciones quedaron vacías
        System.out.println("\n--- Limpieza de colecciones ---");
        System.out.println("Cantidad de usuarios: " + usuarios.size());
        System.out.println("Cantidad de peliculas: " + peliculas.size());
        System.out.println("Cantidad de documentales: " + documentales.size());
        System.out.println("Cantidad de series: " + series.size());
       
    }
    
}
