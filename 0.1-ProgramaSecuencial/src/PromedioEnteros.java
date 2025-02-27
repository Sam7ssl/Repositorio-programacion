//Escribir un programa que calcula y muestra el promedio de los números enteros 1,
//7, 9 y 34.
import javax.swing.*;
public class PromedioEnteros {
    public static void main(String[] args) {
        int num1=1, num2=7, num3=9, num4=34;
        int promedio=0;

        promedio=(num1+num2+num3+num4)/4;

        JOptionPane.showMessageDialog(null,
                "El promedio es: " + promedio);
    }
}
