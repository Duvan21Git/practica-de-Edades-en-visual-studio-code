import java.util.Scanner;

public class calcularEdad {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int edad = 20;
        System.out.printf("la edad ingresada es %d\n", edad);
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un adulto");

        }
        System.out.println("fin del programa");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.close();
        System.out.printf("la edad ingresada es %d\n", edad);
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un adulto");
        }
    }
}