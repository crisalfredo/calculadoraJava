public class Multiplicacion extends Operacion{
    private Numero a, b;

    public Multiplicacion(Numero a, Numero b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double ejecutar() {
        return a.getValor() * b.getValor();
    }

}
