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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. 
        
	public static int sumar(int num1, int num2) {
    	int suma;
    	suma = num1 + num2;
    	return suma;

         */
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese dos numeros enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Que decea hacer?");
        System.out.println("Elegir opcion: ");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("la suma es: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("la resta es: " + resta(num1,num2));
                break;
            case 3:
                System.out.println("la multiplicacion es: " + multipli(num1,num2));
                break;
            case 4:
                System.out.println("la divicion es: " + dividi(num1,num2));
                break;
       

        }

    }



public static int suma(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;

    }

    public static int resta(int num1, int num2) {
        int res;
        res = num1 - num2;
        return res;

    }

    public static int multipli(int num1, int num2) {
        int mult;
        mult = num1 - num2;
        return mult;
    }

    public static int dividi(int num1, int num2) {
        int div;
        div = num1 / num2;
        return div;
    }

}
