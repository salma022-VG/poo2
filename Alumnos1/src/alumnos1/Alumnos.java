/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos1;

/**
 *
 * @author SalmaValentinaGonzal
 */
public class Alumnos {
        private String nombre;
        private String apellido;
        private int curso;

    public Alumnos(String nombre, String apellido, int curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + '}';
    }
        
        
       
}
