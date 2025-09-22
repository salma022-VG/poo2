/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos1;

import java.util.ArrayList;

/**
 *
 * @author SalmaValentinaGonzal
 */
public class Alumnos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumnos> obj1 = new ArrayList<Alumnos>();
        Alumnos a1 =new Alumnos("Juan", "Cely", 101);
        Alumnos a2 =new Alumnos("Pedro", "Mancipe", 102);
        Alumnos a3 =new Alumnos("Juan", "Cely", 103);
         obj1.add(a1);
         obj1.add(a2);
         obj1.add(a3);
         for(int i=0;i<obj1.size();i++){
             System.out.println("Estudiantes "+(i+1) + " " + obj1.get(i));
         }
    }
}
    
    

