package UF4_P2_Fnieto;
public class P2_ex3b {
    public static void main(String[] args) {
        P2_ex3 media1 = new P2_ex3();
        media1.setValor(8.5);
        media1.setEtiqueta("Calificación");
        System.out.println("Información de media1: " + media1);
        P2_ex3 media2 = new P2_ex3(9.3, "Puntuación");
        System.out.println("Información de media2: " + media2);
    }
}
