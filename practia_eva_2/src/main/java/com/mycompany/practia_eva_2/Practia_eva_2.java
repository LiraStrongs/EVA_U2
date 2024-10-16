/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practia_eva_2;

import java.util.Scanner;

/**
 *
 * @author sebastianlira
 */
public class Practia_eva_2 {

    public static void main(String[] args) {
        String usuario, pwd;
        Scanner captu =new Scanner(System.in);
        //pantalla de validacion
        
        while(!(usuario.equals("admin") && pwd.equals("1234"))){
        System.out.println("usuario:");
        usuario=captu.nextLine();
        System.out,println("contraseña");
        pwd=captu.nextLine();
        
        }
    }
}
