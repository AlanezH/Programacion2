package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        Empleado[] lista = new Empleado[3];

        System.out.println("Inserte los datos: ");
        for(int i = 0; i < lista.length; i++){
            System.out.print("Nombre: ");
            String nombre = Scanner.next();

            System.out.print("edad: ");
            int edad = Scanner.nextInt();

            System.out.print("salario: ");
            double salario = Scanner.nextDouble();

            System.out.println("Empleado " + (i+1) + " registrado");

            lista[i] = new Empleado(nombre, edad, salario);
        }

        for(int i = 0; i < lista.length; i++){
            lista[i].aumento();
        }


    }
}
