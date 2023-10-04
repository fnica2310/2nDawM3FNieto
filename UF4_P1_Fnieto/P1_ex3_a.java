import java.util.Scanner;

public class P1_ex3_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix la base del rectangle: ");
        double base = scanner.nextDouble();
        System.out.print("Introdueix l'altura del rectangle: ");
        double altura = scanner.nextDouble();
        double perimetre = 2 * (base + altura);
        double area = base * altura;
        System.out.println("El perímetre del rectangle és: " + perimetre);
        System.out.println("L'àrea del rectangle és: " + area);
        scanner.close();
    }
}
