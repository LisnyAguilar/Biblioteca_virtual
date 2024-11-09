/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecavirtual;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Novela");
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Buscar un libro
        System.out.println("Buscar libro por título: 'El Quijote'");
        biblioteca.buscarPorTitulo("El Quijote");

        // Prestar un libro
        System.out.println("\nPrestando 'El Quijote'");
        biblioteca.prestarLibro("El Quijote");

        // Intentar prestar nuevamente
        System.out.println("\nIntentar prestar nuevamente 'El Quijote'");
        biblioteca.prestarLibro("El Quijote");

        // Mostrar libros disponibles
        System.out.println("\nLibros disponibles:");
        biblioteca.mostrarLibrosDisponibles();

        // Devolver un libro
        System.out.println("\nDevolver 'El Quijote'");
        biblioteca.devolverLibro("El Quijote");

        // Mostrar libros disponibles nuevamente
        System.out.println("\nLibros disponibles después de devolver:");
        biblioteca.mostrarLibrosDisponibles();
  
    }
}
