package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        Vehiculo[] carro = new Vehiculo[3];

        for(int i = 0; i < carro.length; i++){
            System.out.print("Marca: ");
            String marca = Scanner.next();

            System.out.print("Modelo: ");
            String modelo = Scanner.next();

            System.out.print("Precio: ");
            int precio = Scanner.nextInt();

            System.out.println("Vehiculo " + (i+1) + " registrado");

            carro[i] = new Vehiculo(marca, modelo, precio);

        }

        for(int i = 0; i < carro.length; i++){
            if((carro[i].getPrecio() > 2500) && (carro[i].getPrecio() < 4000)){
                carro[0] = carro[i];
                carro[0].mostrarDatos();
            }

        }



    }
}