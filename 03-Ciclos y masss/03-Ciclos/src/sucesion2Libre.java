import javax.swing.*;

public class sucesion2Libre {
    public static void main(String[] args) {
        //
        int n = 0;
        int suma = 0;
        int cuadrado =0;
        String sucesion = "";
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el valor de N "));
        for (int i = 1; i * i <= n; i++) {
            //
            cuadrado = i * i;
            suma += cuadrado;
            sucesion += cuadrado + " ";
        }
        //
        JOptionPane.showMessageDialog
                (null, "Sucesión: " + sucesion);
        JOptionPane.showMessageDialog
                (null, "Suma de la sucesión: " + suma);
    }
}
