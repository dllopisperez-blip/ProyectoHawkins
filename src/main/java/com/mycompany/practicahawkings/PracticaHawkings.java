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
    String operario;
    System.out.println("--Bienvenido al Sistema de monitorización--");
    System.out.println("Introduzca su nombre de operario:");
    operario = sc.nextLine();
    mostrarEncabezado(sc);
    sc.close();
    }
     public static void mostrarEncabezado(Scanner sc){
    int opcionMenu, codigo = 0;
    float sensorMedido;
    final float MAX_ENERGIA = 200.0f, LIMITE_RIESGO = 150.0f;
      do{
        System.out.printf("\t*----------------------------*\n");
        System.out.printf("\t|%-28s|\n", "      Sistema Hawkings");
        System.out.printf("\t*----------------------------*\n");
        System.out.printf("\t| %-27s|\n", "1. Inspeccionar sensor.");
        System.out.printf("\t| %-27s|\n", "2. Muestreo continuo.");
        System.out.printf("\t| %-27s|\n", "0. Salir.");
        System.out.printf("\t*----------------------------*\n");
    opcionMenu = sc.nextInt();
     switch(opcionMenu){       
         case 1:            
             leerLecturaSegura (sc);            
         break; 
         case 2:
             simularMuestreoContinuo(sc, LIMITE_RIESGO);
         }
        }while(opcionMenu != 0);
       System.out.println("**Pase un buen día y no se olvide de reportar cualquier indicio de actividad de demogorgons.**");
    }

public static void leerLecturaSegura (Scanner sc){
    System.out.println("Introduce lectura μT: ");
    float sensorMedido = sc.nextFloat(); 
    evaluarNivelRiesgo (sensorMedido, codigo);
}
public static void evaluarNivelRiesgo(float sensorMedido, int codigo){
    if(sensorMedido < 50.0){
        codigo = 1;
    }else{
        if(sensorMedido>=50.0 && sensorMedido<150.0){
        codigo = 2;
        }else{
        codigo = 3;
        }               
    }
   calcularPorcentajeTruncado(); 
}
public static void calcularPorcentajeTruncado(sensorMedido, MAX_ENERGIA){
}
public static void ejecutarProtocoloAccion(){
}
public static void simularMuestreoContinuo()(Scanner sc, double limite){
    
 }
}


