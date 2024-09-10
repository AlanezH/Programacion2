package Ejercicio2;

public class Vehiculo {
    String marca;
    String modelo;
    int precio;

    public Vehiculo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void mostrarDatos(){
        System.out.println("Carro entre los 2500$ - 4000$: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }

}

