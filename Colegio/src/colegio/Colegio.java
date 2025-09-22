
package colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Colegio {

    
    public static void main(String[] args) {
       ArrayList<Colegio1> listaColegio1 = new ArrayList<>();
       
       int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos colegios desea registrar?"));
       
       
       for (int i = 0; i < n; i++){
           String nombre = JOptionPane.showInputDialog("Ingrese el nombre del colegio: ");
           String direccion = JOptionPane.showInputDialog("Ingrese la direccion del colegio: ");
           int numEstudiantes  = Integer.parseInt (JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));
           String rector = JOptionPane.showInputDialog("Ingrese el nombre del rector");
           
           
           Colegio1 c = new Colegio1(nombre, direccion, numEstudiantes, rector);
           listaColegio1.add(c);
       }
       
       StringBuilder resultado = new StringBuilder("Lista de colegios: \n\n");
       for (Colegio1 c : listaColegio1){
        resultado.append(c.mostrar()).append("\n");
    }
    }
    
}
