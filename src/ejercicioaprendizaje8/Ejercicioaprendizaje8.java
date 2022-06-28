/*Ejercicio 8
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package ejercicioaprendizaje8;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       
     System.out.println("Ingrese una frase");
        String Frase = leer.nextLine();
   
       int n = Frase.length();
        
        if(n==8){
            
            System.out.println("Es correcto");
            
            
        }else{
            
            System.out.println("Es incorrecto");
            
        
        
    }
    
}
