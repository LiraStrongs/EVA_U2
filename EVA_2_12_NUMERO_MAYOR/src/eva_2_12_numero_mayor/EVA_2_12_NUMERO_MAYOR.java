/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author sebastianlira
 */
public class EVA_2_12_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int numero, masgrande = -9999;
        Scanner captu =new Scanner(System.in);
        int acomulador;
        
        do{
        System.out.println("introduce un numero");
        numero = captu.nextInt();
        if (numero > masgrande)
            masgrande = numero;
        
        
        }while(numero < -1 || numero > -1);
       System.out.println("numero mas alto"+ acomulador);
        
        
    }
    
}
