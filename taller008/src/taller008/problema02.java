/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char valor;
            for (int j = 1; j <= 26; j++) {
                valor = (char)(j+96);
                for (int i = 0 ; i < j; i++) {
                   System.out.printf("%s", valor);
            }
                System.out.println("");
            }
    }
}
