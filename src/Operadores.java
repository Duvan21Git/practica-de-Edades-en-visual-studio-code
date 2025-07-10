public class Operadores {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean resultado1 = a > b;
        boolean resultado2 = (a % 2 == 0) && (b < 5);

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println("¿a es mayor que b? " + resultado1);
        System.out.println("¿a es par Y b menor que 5? " + resultado2);

        /*
         * Declare dos variables int llamadas num1 y num2.
         * Calcule y muestre: suma, resta, multiplicación, división y módulo.
         * Compare si num1 es mayor que num2.
         * Verifique si ambos son pares usando el operador % y &&.
         */

        // Declaración de variables
        int num1 = 12;
        int num2 = 4;

        // Operaciones aritméticas
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo (residuo): " + (num1 % num2));

        // Comparación
        boolean mayor = num1 > num2;
        System.out.println("¿num1 es mayor que num2?: " + mayor);

        // Lógica para saber si ambos son pares
        boolean ambosPares = (num1 % 2 == 0) && (num2 % 2 == 0);
        System.out.println("¿Ambos son pares?: " + ambosPares);

    }
}
