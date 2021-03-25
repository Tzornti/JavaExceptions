package UncheckedExceptions;

import CheckedExceptions.NegativeTest.SumandoWithNegative;

public class Excedinglimit extends RuntimeException{
    public Excedinglimit(String ErrorMessage){
        super(ErrorMessage);
    }
}
