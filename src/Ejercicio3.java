public class Ejercicio3 {
    public static void main(String[] args) {

        //Definir una variable numerica para guardar la hora 0-24. Escribir por la consola: "Buenos días " si la hora esta entre 0 y 12 y en el resto de los casos "Buenas noches"

        int hora=50;
        if (hora>=0 && hora<= 12)
        {
            System.out.println("Buenos días");
        }else if (hora>=12 && hora<=24) {
            System.out.println("Buenas noches");
        }else {
            System.out.println("Valor inválido");
        }
    }
}
