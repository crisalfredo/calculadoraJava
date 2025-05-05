public class Potencia extends Operacion{
    private Numero base, exponent;

    public Potencia(Numero base, Numero exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double ejecutar() {
        return Math.pow(base.getValor(), exponent.getValor());
    }
}
