import javax.swing.*;

public class antecedeLibre {
    public static void main(String[] args) {
        //
        int suma = 0;
        int n=0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un número: "));
        int i = 1;
        //
        while (i < n) {
            suma += i;
            i++;
        }
        //
        JOptionPane.showMessageDialog
                (null, "La suma de los números que anteceden a " + n + " es: " + suma);
    }
}

