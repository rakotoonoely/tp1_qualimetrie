/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri_tp_qualimetrie;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ndimb
 */
public class Tri_tp_qualimetrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Entrez votre tableau: ");

        String tableau = myObj.nextLine(); 
        System.out.println("Ci-après mon tableau: " + tableau);  

        int[] tableau;
        System.out.println("Tableau avant tri:  " + Arrays.toString(tableau));

        int[] listTrieCroissante = triCroissante(liste);
        System.out.println("Tableau après tri:  " + Arrays.toString(listTrieCroissante));
    }

    public static int[] triCroissante(int[] liste) {
        int n = liste.length;
        boolean permute;

        do {
            permute = false;
            for (int i = 0; i < n - 1; i++) {

                if (liste[i] > liste[i + 1]) {
                    int temp = liste[i];
                    liste[i] = liste[i + 1];
                    liste[i + 1] = temp;
                    permute = true;
                }
            }
            n--;
        } while (permute);

        return liste;
    }

}
