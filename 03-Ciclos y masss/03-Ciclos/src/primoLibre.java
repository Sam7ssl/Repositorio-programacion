import javax.swing.*;

public class primoLibre {
    public static void main(String[] args) {
        //
        int n=0;
        boolean esPrimo = true;
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un número: "));
        //
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        //
        if (esPrimo) {
            JOptionPane.showMessageDialog
                    (null, n + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog
                    (null, n + " no es un número primo.");
        }
    }
}