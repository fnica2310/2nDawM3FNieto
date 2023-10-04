import java.util.Scanner;
public class P1_ex6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        double numero2 = scanner.nextDouble();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double division = numero1 / numero2;
        double multiplicacion = numero1 * numero2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        if (numero2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        System.out.println("Multiplicación: " + multiplicacion);
        scanner.close();
    }
}
