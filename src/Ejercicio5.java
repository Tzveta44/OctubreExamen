import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Mostrar en la consola del 10 al 0


        double precio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("El precio es de: ");
        precio = teclado.nextDouble();

        for (int i = 10; i >= 0; i--) {

            System.out.println("Mostrar los números:" + i);
        }
    }
}
