package Finally;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.function.ToIntFunction;

public class Divisora {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite un numero");
        String num2 = JOptionPane.showInputDialog("Digite otro numero");
        try {
            int dividendo = Integer.valueOf(num1);
            int divisor = Integer.valueOf(num2);
            int resultado = dividendo/divisor;
            JOptionPane.showMessageDialog(null, "El resultado es "+ resultado);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se acepta cero como segundo numero");
        }finally {
            JOptionPane.showMessageDialog(null, "Se agradece el uso de este programa y se recuerda que dividir entre cero esta indefinido");
            System.out.println("Si se estuviese utilizando algun archibo o ventana con metodo para cerrar aqui sería agregadp");
        }
    }
}
