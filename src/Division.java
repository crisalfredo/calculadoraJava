public class Division extends Operacion{
    private Numero a, b;
    public Division(Numero a, Numero b){
        this.a  = a;
        this.b = b;
    }

    @Override
    public double ejecutar() {
        if(b.getValor() == 0){
            throw new ArithmeticException("Division por cero");
        }
        return a.getValor() / b.getValor();
    }
}
