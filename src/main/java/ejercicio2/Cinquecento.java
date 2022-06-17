/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Ramiro Andres Tupiza Charro 
 */
public class Cinquecento {
 
    public static void main(String args[]) {
      mostrarSiglo();
    }
    public static void mostrarSiglo (){
     
try {
 int numeroCasos ;
      int año;
      int siglo;
      //Scanner para perdir al usuario que introduzca un nuemero
      Scanner entrada  = new Scanner(System.in);
      System.out.println("Introduce el número de casos de los que quieres saber el siglo:");
      numeroCasos = entrada.nextInt();
      System.out.println("Introduce el año del cual quieres saber el siglo:");
      //Lo que hacemos "numeroCasos-- != 0" es que  Compruebe que numeroCasos no es igual a cero antes 
      //de realizarle un decremento, hasta llegar a la psocion 3 donde se para el programa 
      while (numeroCasos-- != 0) {
      //agrego en año la entra por teclado 
        año = entrada.nextInt();
        
        //Math.floorMod(año,100) actua como el modulo el resto de una división entre enteros es distinto a cero (condicion)
        // 1 es verdadero y 0 seria falsso siendo asi que se sumaria a la division 
        //que hemos realizado previamente 
        siglo = (año / 100) + (Math.floorMod(año,100) != 0 ? 1 : 0);
        
        System.out.println(siglo);
      }
        
            //Excepciones 
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }
}

