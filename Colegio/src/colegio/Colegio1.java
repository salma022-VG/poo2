/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

public class Colegio1 {
    private String nombre;
    private String direccion;
    private int numEstudiantes;
    private String rector;

    //constructor
    public Colegio1(String nombre, String direccion, int numEstudiantes, String rector) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEstudiantes = numEstudiantes;
        this.rector = rector;
    }
    
    public String mostrar(){
        return "Nombre: " + nombre + 
                "\nDreccion: " + direccion +
                "\nNúmero de estudiantes: " + numEstudiantes +
                "\nRector: " + rector + "\n";
    }
    
}
