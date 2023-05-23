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
public class ejej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima 
        los datos de las personas ingresadas por teclado e indique si son mayores
        o menores de edad. Después de cada persona, el programa debe preguntarle al
        usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
          String nom;
          int edad;
          String resp;
    
        do {
            System.out.println("NOMBRE");
            nom = sc.next();
            System.out.println("EDAD");
            edad = sc.nextInt();
            System.out.println(nom+" "+mayor(edad)+" AÑOS");
            System.out.println("desea continuar SI/NO?");
            resp = sc.next();
            
        } while (!resp.equals("NO"));

            
    }

    public static int mayor(int edad) {
        int may = edad;
        if (edad >= 18) {
            System.out.println("ES MAYOR DE EDAD");

        }else{
            System.out.println("ES MENOR DE EDAD");
        }
        return may;
    }   
        

        
        
    
}
        
        
        
            
        
        
    
   
    

