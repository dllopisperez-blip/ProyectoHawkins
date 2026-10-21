/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicahawkings;

/**
 *
 * @author david_llopis
 */
import java.util.Scanner;
public class PracticaHawkings {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    float sensorMedido;
    final float MAX_ENERGIA, LIMITEENERGIA;
    
        do{
    System.out.println("*------Sistema Hawkings------*");
    System.out.println("|  1.Inspeccionar sensor.    |");
    System.out.println("|  2.Muestreo continuo.      |");
    System.out.println("|  0.Salir.                  |");
    System.out.println("*----------------------------*");
    opcion = sc.nextInt();
     switch(opcion){       
         case 1:            
             System.out.println("Introduce lectura μT: ");
             sensorMedido = sc.nextInt();            
         break;         
        }
        }while(opcion != 0);
       System.out.println("Pase un buen día y no se olvide de reportar cualquier indicio de actividad de demogorgons.");
    }
}


/////////////////modulo C/////////////

