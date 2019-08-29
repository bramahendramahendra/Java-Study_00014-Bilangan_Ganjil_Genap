/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan.ganjil.genap;

import java.util.Scanner;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class BilanganGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Input sebuah bilangan : ");
        int bilangan=s.nextInt();
        if (bilangan % 2 == 1) {
            System.out.printf(bilangan+" Adalah bilangan GANJIL ");
        }
        else
            System.out.printf(bilangan+" Adalah bilangan GENAP ");
    }
    
}
