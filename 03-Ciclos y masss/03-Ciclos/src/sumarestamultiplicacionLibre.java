import javax.swing.*;

public class sumarestamultiplicacionLibre {
    public static void main(String[] args) {
        //
        int sumaPositivos = 0;
        int productoNegativos = 0;
        int n=0;
        int numero=0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese la cantidad de números: "));
        int i = 1;
        //
        while (i <= n) {
            numero = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el número " + i + ": "));
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                productoNegativos *= numero;
            }
            i++;
        }
        //
        JOptionPane.showMessageDialog
                (null, "La suma de los números positivos es: " + sumaPositivos + "\n"
                + "El producto de los números negativos es: " + productoNegativos);
    }
}