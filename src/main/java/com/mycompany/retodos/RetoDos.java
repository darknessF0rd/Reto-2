package com.mycompany.retodos;
import java.util.Scanner;
/**
 *
 * @author Darkness
 * Jhon_Edwar_Gonzalez_Arenas
 */
public class RetoDos {

    public static void main(String[] args) {
        
        String opcion;
        System.out.println("\nBIENVENIDOS AL RETO 2.\n \n ");
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("ELIJA UNA DE LAS OPCIONES:\n 1)Calcular el cuadrado de los N primeros enteros mediante suma de numeros impares.\n 2)Calcular los N primeros primos y sumarlos.\n 3)Calcular los posible desarrollos de una bicicleta de montaña.\n 4)Salir del programa.");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextLine();
            switch(opcion){
                case "1" -> {
                    System.out.print("Ingresar n: ");                    
                    int n = sc.nextInt();
                    int contador = 0;
                    for(int i = 1; contador < n; i++){
                        int total = 0;
                        int suma = 0;
                        for(int j = 1; j <= i; j++){
                            suma = 2*j -1;
                            if(j < i) System.out.print(suma + " + ");
                            else System.out.print(suma);                            
                            total = total + 2*j - 1;
                        }
                        contador++;
                        System.out.println( " = " + total); 
                    }
                    
                }
                
                case "2" -> {
                    System.out.print("Ingresar n: ");
                    int n = sc.nextInt();
                    int contador = 0;
                    int sumaPrimo = 0;
                    for(int i = 2; contador < n; i++){
                        boolean esPrimo = true;
                        int j = 2;
                        while(esPrimo == true && j < i){
                            if(i % j == 0){
                                esPrimo = false;
                            }
                            else{
                                j++;
                            }
                        }
                        if(esPrimo == true){
                            System.out.println(i);
                            sumaPrimo = sumaPrimo + i;
                            contador++;
                        }
                    }
                    System.out.println("La suma de los n primeros primos es: " + sumaPrimo);
                }
                
                case "3" -> {
                    int tamañoLlanta = 0; 
                    String opcionLlantas;
                    do{
                        System.out.println("Elija las dimenciones de las llantas:\n 1) 29x2.1\n 2) 29x2.2\n 3) 29x2.3");
                        opcionLlantas = sc.nextLine();
                        switch(opcionLlantas){                        
                            case "1":
                                tamañoLlanta = 2288;
                                opcionLlantas = "0";
                                break;
                            case "2": 
                                tamañoLlanta = 2298;
                                opcionLlantas = "0";
                                break;
                            case "3": 
                                tamañoLlanta = 2326;
                                opcionLlantas = "0";
                                break;
                            default:
                                System.out.println("Esta opcion no esta permitida.");
                                break;
                        }  
                    }while(!opcionLlantas.equals("0"));
                    
                    double[]dientesDelanteros = new double[2];
                    double[]dientesTraseros = new double[12];
                    System.out.println("Ingrese el numero de dientes para los 2 platos delanteros.");
                    for(int i = 0; i < dientesDelanteros.length; i++){
                        System.out.print("El numero de dientes del plato delantero # " + (i+1) + " sera: ");
                        dientesDelanteros[i] = sc.nextInt();
                    }
                    System.out.println("Ingrese el numero de dientes para los 12 piñones traseros DIFERENTE DE CERO(0).");
                    for(int i = 0; i < dientesTraseros.length; i++){
                        System.out.print("El numero de dientes del piñon trasero # " + (i+1) + " sera: ");
                        dientesTraseros[i] = sc.nextInt();
                        if(dientesTraseros[i]==0){
                            System.out.println("El numero ingresado debe ser mayor que cero.");
                            i--;
                        }                        
                    }                    
                    for(int i = 0; i < dientesDelanteros.length; i++){
                        for(int j = 0; j < dientesTraseros.length; j++){
                            System.out.println("Con el plato delantero # " + (i+1) +" y el piñon trasero # " + (j+1) + ", la bicicleta puede avanzar con cada pedaleada : " + (((dientesDelanteros[i]/dientesTraseros[j])* tamañoLlanta)/1000) + " metros.");
                        }
                    }                    
                }
                default -> {
                        System.out.println("Esta opcion no esta permitida.");
                }
            }
        }while(!opcion.equals("4"));
        System.out.println("Gracias por participar (y).");    
    }
}
