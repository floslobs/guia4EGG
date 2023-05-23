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
public class ejej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo 
        pasamos por parámetro para que nos indique si es o no un número primo, debe devolver
        true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese un numero ");
        int num = sc.nextInt();
        primo(num);

    }

    public static boolean primo(int num) {

        // numero primo es divisible por 1 o por si mismo
        int aux = 0; // auxiliar que ayuda a contar los ceros

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                aux ++;    //va sumando los ceros, si la cantidad de 0 es 2 quieres decir q es primo

            }
            if (aux > 2) { // si la cantidad de ceros es mas de dos no es primo
                break;
                
            }

        }
        return aux <= 2;

    }

}
