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
public class problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "universidad";
        String suma = "";
        char variable;
        for (int i = 0; i < cadena.length(); i++) {
            variable = cadena.charAt(i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s", variable);
            }
            System.out.println("");
        }
    }
}
