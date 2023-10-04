import java.util.Scanner;

public class P1_ex2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el teu nom: ");
        String nom = scanner.nextLine();
        System.out.println("Hola, " + nom + "! Benvingut/da.");
        scanner.close();
    }
}