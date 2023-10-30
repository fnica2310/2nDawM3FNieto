package UF4_P2_Fnieto;
public class P2_ex5 {
    private double real;
    private double imaginary;
    public P2_ex5() {
        this(0, 0);
    }
    public P2_ex5(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public P2_ex5 add(P2_ex5 c) {
        double newReal = this.real + c.getReal();
        double newImaginary = this.imaginary + c.getImaginary();
        return new P2_ex5(newReal, newImaginary);
    }
    @Override
    public String toString() {
        return real + ", " + imaginary;
    }
    //Las buenas prácticas definen las constantes justo antes de los atributos.
    public static final P2_ex5 ZERO = new P2_ex5(0, 0);
}