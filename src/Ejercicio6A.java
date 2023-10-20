import java.util.Scanner;

public class Ejercicio6A {
    public static void main(String[] args) {

        //Citar por consola el DNI, nombre y direccion y mostrar en la consola el texto siguiente:
        //nombre: xxxxx con DNI: xxxx y vive en: xxxxx

        String nombre, dni, direccion;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribir el nombre");
        nombre=teclado.nextLine();
        System.out.println("Ecribir el DNI");
        dni=teclado.nextLine();
        System.out.println("Escribir la direccion");
        direccion=teclado.nextLine();

    }
}
