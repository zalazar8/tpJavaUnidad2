package tpunidad2;

import java.util.Scanner;

public class TpUnidad2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        String edad = entrada.nextLine();
        System.out.println("Ingrese su hobbie: ");
        String hobbie = entrada.nextLine();
        System.out.println("Ingrese su editor de código preferido: ");
        String editor = entrada.nextLine();
        System.out.println("Ingrese el sistema operativo que utiliza: ");
        String so = entrada.nextLine();
        
        System.out.println("Bienvenid@! " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su hobbie es: " + hobbie);
        System.out.println("Su editor de código preferido es: " + editor);
        System.out.println("El sistema operativo que utiliza es: " + so);
    }
    
}
