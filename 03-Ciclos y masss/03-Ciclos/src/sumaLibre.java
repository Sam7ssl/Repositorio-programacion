import javax.swing.*;

public class sumaLibre {
    public static void main(String[] args) {
        //
        int suma = 0;
        //
        for (int i = 100; i >= 0; i -= 2) {
            suma += i;
        }
        //
        JOptionPane.showMessageDialog
                (null, "La suma de la serie es: " + suma);
    }
}
