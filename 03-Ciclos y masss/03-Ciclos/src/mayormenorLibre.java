import javax.swing.*;

public class mayormenorLibre {
    public static void main(String[] args) {
        //
        int n = 0;
        int numero = 0;
        int mayor = 0;
        int menor = 0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese la cantidad de números a evaluar"));
        //
        numero = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número 1"));
        mayor = numero = menor;
        //
        for (int i = 2; i <= n; i++) {
            //
            numero = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el número " + i));
            //
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        //
        JOptionPane.showMessageDialog
                (null, "Número mayor: " + mayor);
        JOptionPane.showMessageDialog
                (null, "Número menor: " + menor);
    }
}