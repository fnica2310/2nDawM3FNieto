package UF4_P2_Fnieto;
public class P2_ex5b {
    public static void main(String[] args) {
        P2_ex5 num1 = new P2_ex5(3.0, 4.0);
        P2_ex5 num2 = new P2_ex5(1.5, 2.5);
        P2_ex5 sum = num1.add(num2);
        System.out.println("Suma: " + sum.toString());
        System.out.println("Real de num1: " + num1.getReal());
        System.out.println("Imaginario de num1: " + num1.getImaginary());
        P2_ex5 zero = P2_ex5.ZERO;
        System.out.println("ZERO: " + zero.toString());
    }
}
