import java.util.Scanner;

import javax.swing.JOptionPane;

public class Edades {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", bienvenido al programa de edades");
        System.out.println("Ingrese su edad: ");
        Integer edad = teclado.nextInt();
        teclado.close();
        JOptionPane.showMessageDialog(null, "La edad ingresada es: " + edad);
        if (edad < 12) {
            JOptionPane.showMessageDialog(null, "Eres un niño");
        } else if (edad >= 12 && edad <= 17) {
            JOptionPane.showMessageDialog(null, "Eres un adolescente");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un adulto");
        }
    }
}