package TryCatch;

import java.util.Scanner;

public class Sumador {
    public static void main(String[] args) {
        var num1 = 0;
        var num2 = 0;
        Scanner escrito = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = escrito.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = escrito.nextInt();
        Sumando primer= new Sumando(num1,num2);
        try {
            primer.suma();
        }
        catch (IllegalArgumentException negative){
            System.err.println(negative.getMessage());
        }
    }
}
