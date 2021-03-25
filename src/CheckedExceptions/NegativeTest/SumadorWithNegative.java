package CheckedExceptions.NegativeTest;

import CheckedExceptions.NegativeException;
import TryCatch.Sumando;

import java.util.Scanner;

public class SumadorWithNegative {
    public static void main(String[] args) {
        var num1 = 0;
        var num2 = 0;
        Scanner escrito = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = escrito.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = escrito.nextInt();
        SumandoWithNegative primer= new SumandoWithNegative(num1,num2);
        try {
            primer.suma();
        }
        catch (NegativeException negative){
            negative.printStackTrace();
        }
    }
}
