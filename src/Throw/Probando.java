package Throw;

import java.util.Scanner;

public class Probando {
    public static void main (String [] args){
        Scanner escrito = new Scanner(System.in);
        var nombres=new SimpleList();
        nombres.append("Enrique");
        nombres.getLarge();
        nombres.append("Fernando");
        nombres.getLarge();
        nombres.append("Jordy");
        nombres.getLarge();
        System.out.println("Digite la posicion a la que desea acceder.");
        var pos= escrito.nextInt();
        System.out.println(nombres.ShowDataInPos(pos));
    }
}
