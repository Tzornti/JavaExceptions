package UncheckedExceptions.ExcedingTest;

import UncheckedExceptions.Excedinglimit;

import java.util.Scanner;

public class ProbandoExceding {
    public static void main(String[] args) {
        Scanner escrito = new Scanner(System.in);
        var nombres = new SimpleListExceding();
        nombres.append("Enrique");
        nombres.getLarge();
        nombres.append("Fernando");
        nombres.getLarge();
        nombres.append("Jordy");
        nombres.getLarge();
        try {
            System.out.println("Digite la posicion a la que desea acceder.");
            var pos = escrito.nextInt();
            System.out.println(nombres.ShowDataInPos(pos));
        } catch (Excedinglimit e){
            e.printStackTrace();
        }
    }
}
