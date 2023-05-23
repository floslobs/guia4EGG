/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4flor;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class ejej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que a través de una función nos convierta una cantidad
        de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
        yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
        moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
        un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la cantida de euros a convertir");
        double euros = sc.nextInt();
        convertidor(euros);
    }
    
    public static void convertidor(double euros) {
        double libras = 0.86 * euros;
        double dolares = 1.28 * euros;
        double yanes = 129.8 * euros;
        
        System.out.println("sus euros en libras es: "+libras);
        System.out.println("sus euros en dolares es: "+dolares);
        System.out.println("sus euros en yanes es: "+yanes);
    }
}
