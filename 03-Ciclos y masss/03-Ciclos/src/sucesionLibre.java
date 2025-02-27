import javax.swing.*;

public class sucesionLibre {
    public static void main(String[] args) {
        //
        int n = 0;
        int suma = 0;
        String sucesion = "";
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el valor de N "));
        for (int i = 20; i <= n; i += 5) {
            //
            suma += i;
            sucesion += i+"";
        }
        //
        JOptionPane.showMessageDialog
                (null, "Sucesión: " + sucesion);
        JOptionPane.showMessageDialog
                (null, "Suma de la sucesión: " + suma);
    }
}