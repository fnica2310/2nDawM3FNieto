import java.util.Scanner;
public class P1_ex4 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero (capital inicial):");
        double capitalInicial = scanner.nextDouble();
        System.out.println("Introduce la tasa de interés (en porcentaje):");
        double tasaInteres = scanner.nextDouble();
        System.out.println("Introduce el número de años:");
        int numeroAnios = scanner.nextInt();
        double tasaInteresFraccion = tasaInteres / 100.0;
        double cantidadAPagar = capitalInicial * Math.pow(1 + tasaInteresFraccion, numeroAnios);
        System.out.println("La cantidad de dinero a pagar es: " + cantidadAPagar);
        scanner.close();
    }
}
