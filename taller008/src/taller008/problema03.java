/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int x;
        double operacion;
        double total=0;
        System.out.println("Ingresar el límite de la operación");
        x = entrada.nextInt();
        if (x >= 0){
         for (int i = 1; i <= x; i++) {
            operacion = 1 /(Math.pow(2,i));
            total = total + operacion;
         }
         
        }else{
            System.out.println("El valor ingresado no es positivo");
        }
        System.out.printf("%.2f", total);
    }
        
}
