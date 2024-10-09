/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_cadena_de_texto1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica1_cadena_de_texto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner captura = new Scanner(System.in);
        
        int hola,num,acom;
        
        System.out.println("introduzca el numero de veces el cual se repita el nuymero");
        num = captura.nextInt();
        captura.nextLine();
                System.out.println("se repetira hola");
                hola=captura.nextInt();
                  captura.nextLine();
                  
                  for(int i=1;i<=num ;i++){
                System.out.println(hola+ "sobas");
        
        
    }
    
}
