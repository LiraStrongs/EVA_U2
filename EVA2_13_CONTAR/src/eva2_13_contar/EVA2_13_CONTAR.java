/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author sebastianlira
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRACTICA_CONTAR LAS VOCALES DE UNA CADENA
        
       


        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cadena al usuario
        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();
        
        // Inicializar contador de vocales
        int contadorVocales = 0;
        
        // Convertir la cadena a minúsculas para simplificar el conteo
        cadena = cadena.toLowerCase();
        
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            // Verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
                
                 contadorVocales++;{
            
            System.out.println("El número de vocales en la cadena es: " + contadorVocales);
            }

        }
        
        
        
        
    }
    
}
