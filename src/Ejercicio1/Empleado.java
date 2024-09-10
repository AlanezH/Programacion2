package Ejercicio1;

public class Empleado {
    String nombre;
    int edad;
    double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void aumento(){
        double aumento;
        if(salario < 3000){
            aumento = (salario * 0.10) + salario;
            this.salario = aumento;
            System.out.println(nombre + " recibe un aumento del 10%. Salario actual: " + salario);
        } else {
            System.out.println(nombre + " No aplica para el aumento");
        }
    }
}
