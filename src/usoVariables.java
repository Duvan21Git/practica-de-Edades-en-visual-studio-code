import javax.swing.JOptionPane;

public class usoVariables {

    String nombre;
    int edad;

    public static void main(String[] args) {

        int num1 = 29;
        int num2 = 26;
        double resultado = (double) (num1 + num2);
        System.out.println("resultado : " + resultado);

        var num3 = 29;
        var num4 = 26;
        double resultados = (num1 / num2);
        System.out.println("resultado : " + resultados);

        var doble = 32;
        var cadena = "Hola, mundo!";
        System.out.println("Doble: " + doble + ", Cadena: " + cadena);

        // Ejemplo de uso de variables con diferentes tipos de datos

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultados);

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", bienvenido al programa de uso de variables");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        JOptionPane.showMessageDialog(null, "La edad ingresada es: " + edad);

        System.out.println("la suma es: " + (num3 + num4));

    }

}
