//Escribir un programa que calcula y muestra el cuadrado de cada entero
//1-9.
import javax.swing.*;
public class cuadradoEntero {
    public static void main(String[] args) {
        int num =0, cuadrado=0;

        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero entero?"));

        cuadrado = num ^2;

        JOptionPane.showMessageDialog(null,
                "El resultado  es: "+ cuadrado);

    }
}
