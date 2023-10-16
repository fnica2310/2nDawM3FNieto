package UF4_P2_Fnieto;

public class P2_ex3 {
    private double valor;
    private String etiqueta;
    public P2_ex3() {
        valor = 0.0;
        etiqueta = "Sin etiqueta";
    }
    public P2_ex3(double valor, String etiqueta) {
        this.valor = valor;
        this.etiqueta = etiqueta;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getEtiqueta() {
        return etiqueta;
    }
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Valor: " + valor + ", Etiqueta: " + etiqueta;
    }
}
