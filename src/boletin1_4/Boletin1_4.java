/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Teclea primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Teclea segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Suma = "+(num1+num2)+", Resta = "+(num1-num2)+ ", Producto = "+(num1*num2)+", Cociente = "+(num1/num2));
    }
    
}
