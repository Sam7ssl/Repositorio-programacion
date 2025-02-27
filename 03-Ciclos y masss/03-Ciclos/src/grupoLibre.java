import javax.swing.*;

public class grupoLibre {
    public static void main(String[] args) {
        //
        int n = 0;
        int hombres = 0;
        int mujeres=0;
        int genero = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas"));

        for (int i = 1; i <= n; i++) {
            genero=Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el genero del paciente\n1=Hombre\n2=Mujer"));

            if (genero==1) {
                hombres++;
            } else if (genero==2) {
                mujeres++;
            } else {
                JOptionPane.showMessageDialog(null, "Entrada no válida, no se contará.");
            }
        }

        JOptionPane.showMessageDialog
                (null, "Cantidad de hombres: " + hombres + "\nCantidad de mujeres: " + mujeres);
    }
}