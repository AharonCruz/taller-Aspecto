package com.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Aerolinea {
	static final int EXIT = 4;
    static ArrayList<Avion> aviones = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void initBank(){
        aviones.add(new Avion(1,"EC-HCF","Airbus A320"));
        aviones.add(new Avion(2,"EC-HXF","Airbus A320"));

    }

    public static void main(String[] args) {
        int opcion = 0;
        initBank();
        while(opcion != EXIT){
            opcion = menu();
        };

    }
    public static int menu(){
        System.out.println("Aerolinea EC");
        System.out.println("------------------------------------");
        System.out.println("1 - Registrar Avion");
        System.out.println("2 - Despegar");
        System.out.println("3 - Aterrizar");
        System.out.println("4 - Salir");
        System.out.println("------------------------------------");
        int option = Integer.valueOf(readConsole("Opcion"));
        switch (option) {
        case 1:
            System.out.println("Registrar Avion");
            System.out.println("------------------------------------");
            registrarAvion();
        break;
        case 2:
           
            System.out.println("------------------------------------");
             despegar(); 
        break;
        case 3:
            
            System.out.println("------------------------------------");
             aterrizar();
        break;
        case EXIT:
        break;
        default:
            System.out.println("Opcion incorrecta");
            break;
        }
        return option;
    }

    public static  String readConsole(String mensaje){
        System.out.println(mensaje);  
        String inputText;
        inputText = input.nextLine();           
        return inputText;
    }
    //Aquí se llama al punto de corte success
    public static void registrarAvion(){
        String nombre = readConsole("Matricula :");
        int id = Integer.valueOf(readConsole("Id: "));
        String marca = readConsole("Marca :");
        
        aviones.add(new Avion(id,nombre,marca));
    }
     //Aquí se llama al punto de corte success2
    public static void despegar(){
    	System.out.println("Despegar");
    	//aqui va el codigo correspondiente
    	 
    }
     //Aquí se llama al punto de corte retirar
    public static void aterrizar(){
    	System.out.println("Aterrizar");
    	//aqui va el codigo correspondiente
    }

    
    
}
