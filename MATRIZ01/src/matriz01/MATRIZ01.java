
package matriz01;

import java.util.Scanner;


public class MATRIZ01 {

   private Scanner teclado;
    private int [][] mat;
    
    // en este generar se aplica el 1 0 1 0 1
     public void generar() {
        mat = new int[4][4];
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                mat[f][c] = (c % 2 == 0) ? 1 : 0;
            }
        }
    }
 
    public void imprimir(){
        for(int f=0; f<4; f++){
           for(int c=0; c<4;c++){
               System.out.print(mat[f][c]+" ");
           }
            System.out.println();//salto de linea
        }
    }
   
    public static void main(String[] args) {
       
        MATRIZ01 ma=new MATRIZ01();
        ma.generar();
        ma.imprimir();
    }
    
}
