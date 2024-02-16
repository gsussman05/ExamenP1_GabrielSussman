/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_gabrielsussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Examen1_GabrielSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL EXAMEN #1 DEL PRIMER PARCIAL");
        char resp = 's';
        while (resp == 's') {
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a Preguntas");
            System.out.println("3. Mostrar el Historial del Menu");
            System.out.println("4. Salir");
            System.out.println("Ingrese el ejercicio que desea: ");
            int opc_menu = sc.nextInt();
            switch (opc_menu) {
                case 1:
                    System.out.println("BIENVENIDO A EJERCICIOS DE STRINGS");
                    System.out.println("Ingrese una cadena de por lo menos ocho caracteres: ");
                    String cad = sc.nextLine();
                    while (cad.length() < 8) {
                        System.out.println("La cadena de contener OCHO O MAS CARACTERES, ingrese otra cadena: ");
                        cad = sc.nextLine();
                    }
                    if (cad.length() % 2 == 0) {
                        String priMitad = cad.substring(0, cad.length() / 2);
                        String segMitad = cad.substring(cad.length() / 2);
                        String nuevaCad = combineCad(priMitad, segMitad);
                        System.out.println("La primera mitad de la cadena es: " + priMitad);
                        System.out.println("La segunda mitad de la cadena es: " + segMitad);
                        System.out.println("La cadena resultante es: " + nuevaCad);
                    } else {
                        int mitad = cad.length() / 2;
                        String priMitad = cad.substring(0, mitad);
                        String segMitad = cad.substring(mitad);
                        String resCadenas = segMitad + priMitad;

                        System.out.println("La primera mitad de la cadena es: " + priMitad);
                        System.out.println("La segunda mitad de la cadena es: " + segMitad);
                        System.out.println("La cadena resultante es: " + resCadenas);
                        break;
                    }
                case 2:
                    System.out.println("BIENVENIDO A RESPUESTAS A PREGUNTAS");
                    System.out.println("1. Describa el funcionamiento de los ciclor for, while y do while ");
                    System.out.println("2. Describa el funcionamiento de .charAt(), indexOf() y .legth()");
                    System.out.println("3. Mencione 2 tipos de datos primitivos de java y cual es su uso.");
                    System.out.println("Que pregunta desea responder: ");
                    int opCase=sc.nextInt();
                    switch(opCase){
                        case 1:
                            System.out.println("Los ciclos for permiten repetir una instruccion que se repite un numero especificado de veces, pero a la vez pueden servir para crear figuras, jugar con los Srings, entre otros.");
                            System.out.println("El ciclo while nos permite repetir una instruccion depende de que se esta cumpliendo, y el ciclo do while es basicamente lo mismo pero en este se asegura que se va a cumplir el ciclo por lo menos una bez mientras que en el while puede no cumplirse");
                        case 2:
                            System.out.println("El charAt devuelve el caracter de un String o nuevo String en una cadena, se utliza para leer caracteres de igual manera");
                            System.out.println("El .length tal y como lo dice nos sirve para poder ver la longitud de una cadena dividida en caracteres, se puede utlizar no solo en cadenas y nos puede servir para averiguar las posiciones de los caracteres entre otras cosas");
                            System.out.println("El indexOf esta encargado de agarrar un caracter e especifico, es decir devueleve el indice");
                        case 3:
                            System.out.println("Dos datos primitivos en java y los mas basicos son el int y el double, el int es un numero entero que puede ser tanto negativo como positivo, mientras que el double es un numero real que contiene cierta cantidad de decimales. ");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo...");

            }
            
        }
    }

    public static String combineCad(String priMitad, String segMitad) {
        int primLong, segLong, maxLong;
        String Nueva_Cadena = "";
        primLong = priMitad.length();
        segLong = segMitad.length();
        if (primLong > segLong) {
            maxLong = primLong;
        } else {
            maxLong = segLong;
        }
        for (int i = 0; i < maxLong; i++) {
            if (i < primLong) {
                Nueva_Cadena += priMitad.charAt(i);
            }
            if (i < segLong) {
                Nueva_Cadena += segMitad.charAt(i);
            }
            if (i != maxLong - 1) {
                Nueva_Cadena += '-';
            }
        }
        return Nueva_Cadena;
    }

}
//No me dio chance para el 3 ingeniera :(