package UF4_P2_Fnieto;

//Pido los nombres de las clases exactas, no puedes poner P2_ex2 en este caso.
public class P2_ex2 {
    private int valorPrimari;
    private int valorSecundari;

    public P2_ex2() {
        valorPrimari = 5;
        valorSecundari = 10;
    }

    public P2_ex2(int vp) {
        valorPrimari = vp;
        valorSecundari = 10;
    }

    public P2_ex2(int vp, int vs) {
        valorPrimari = vp;
        valorSecundari = vs;
    }

    public int getPrimari() {
        return valorPrimari;
    }

    public int getSecundari() {
        return valorSecundari;
    }

    public static void main(String[] args) {
        P2_ex2 a = new P2_ex2();
        P2_ex2 b = new P2_ex2(20);
        P2_ex2 c = new P2_ex2(20, 40);

        System.out.println("L'objecte [a] conté: " + a.getPrimari() + ", " + a.getSecundari());
        System.out.println("L'objecte [b] conté: " + b.getPrimari() + ", " + b.getSecundari());
        System.out.println("L'objecte [c] conté: " + c.getPrimari() + ", " + c.getSecundari());
    }
}
