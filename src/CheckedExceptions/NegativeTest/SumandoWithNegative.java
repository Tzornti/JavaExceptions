package CheckedExceptions.NegativeTest;

import CheckedExceptions.NegativeException;

public class SumandoWithNegative {
    //Clase que suma enteros positivos y hace Throw en caso de recibir un negativo
    int number1=0;
    int number2=0;
    int resultado;
    public SumandoWithNegative(int x, int y){
        number1=x;
        number2=y;
    }
    public int suma() throws NegativeException {
        if (this.number2<0 || this.number1<0){
            throw new NegativeException ("No se recibe numeros negativos");
        }
        else{
            resultado=this.number1+this.number2;
            return resultado;
        }
    }

}

