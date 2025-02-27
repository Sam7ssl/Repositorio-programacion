import javax.swing.*;

public class calificacionesLibre {
    public static void main(String[] args) {
        //
        int n = 0;
        int calificacion = 0;
        int aprobados = 0;
        int reprobados = 0;
        double porcentajeAprobados = 0.0;
        double porcentajeReprobados = 0.0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de alumnos"));
        for (int i = 1; i <= n; i++) {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese la calificación del alumno " + i));
            //
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        //
        porcentajeAprobados = (aprobados * 100.0) / n;
        porcentajeReprobados = (reprobados * 100.0) / n;
        //
        JOptionPane.showMessageDialog
                (null, "Porcentaje de aprobados: " + porcentajeAprobados );
        JOptionPane.showMessageDialog
                (null, "Porcentaje de reprobados: " + porcentajeReprobados );
    }
}

