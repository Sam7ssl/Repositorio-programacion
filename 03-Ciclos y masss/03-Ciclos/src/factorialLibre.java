import javax.swing.*;

public class factorialLibre {
    public static void main(String[] args) {
        //
        int n=0;
        int factorial=0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo: "));
        //
        factorial = 1;
        //
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        //
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }
}