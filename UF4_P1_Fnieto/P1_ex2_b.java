import java.util.Scanner;

public class P1_ex2_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Introdueix el segon número: ");
        double numero2 = scanner.nextDouble();
        double producte = numero1 * numero2;
        System.out.println("El producte de " + numero1 + " i " + numero2 + " és " + producte);
        scanner.close();
    }
}
