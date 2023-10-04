import java.util.Scanner;

public class P1_ex3_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        scanner.close();
    }
}
