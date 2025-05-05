import java.math.*;

public class RaizCuadrada extends Operacion{
    private Numero a;

    public RaizCuadrada(Numero a) {
        this.a = a;
    }

    @Override
    public double ejecutar(){
        if(a.getValor() < 0){
            throw new ArithmeticException("Raiz cuadrada de numero negativo");
        }
        return Math.sqrt(a.getValor());
    }
}
