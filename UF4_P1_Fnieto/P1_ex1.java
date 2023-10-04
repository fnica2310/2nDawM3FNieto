import java.util.Scanner;

public class P1_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        double numero = scanner.nextDouble();
        double quadrat = numero * numero;
        System.out.println("El quadrat de " + numero + " és " + quadrat);
        scanner.close();
    }
}
