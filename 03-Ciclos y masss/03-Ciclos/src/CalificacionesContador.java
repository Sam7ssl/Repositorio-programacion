import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {
        //Declaracion de variables

        int numAprobados = 0;
        int numReprobados = 0;
        int numCalif = 0;
        double calif = 0.0;

        numCalif = Integer.parseInt(JOptionPane.showInputDialog
                ("Cuantas calificaciones se van a evaluar"));

        for (int i = 1; i <= numCalif; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingresa la calificacion" + i));

            if (calif >= 7.0) {
                //contar el numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }
            i++;

        }
        JOptionPane.showMessageDialog(null,
                "El numero de aprobados es ;" + numAprobados +
                        "\nEl numero de reprobados es :" + numReprobados);
        int i = 1;
        numAprobados = 0;
        numReprobados = 0;

        while (i <= numCalif) {
            calif = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingresa la calificacion" + i));
            if (calif >= 7.0) {
                //contar el numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,
                "El numero de aprobados es ;" + numAprobados +
                        "\nEl numero de reprobados es :" + numReprobados);
        i=0;
        numAprobados = 0;
        numReprobados = 0;
        do{
            calif = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingresa la calificacion" + i));
            if (calif >= 7.0) {
                //contar el numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }
            i++;
        }while (i <= numCalif);

        JOptionPane.showMessageDialog(null,
                "El numero de aprobados es ;" + numAprobados +
                        "\nEl numero de reprobados es :" + numReprobados);
    }
}
