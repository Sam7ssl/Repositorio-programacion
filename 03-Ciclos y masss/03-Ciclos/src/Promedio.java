import javax.swing.*;

public class Promedio {
    public static void main(String[] args) {
        //
        int numCalificaciones=0;
        double Calificacion=0.0;
        double promedio=0.0;
        double suma=0.0;

        numCalificaciones=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de calificaciones "));

        for (int i = 0; i <numCalificaciones; i++) {
            Calificacion = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese la calificacion del alumno"));
            suma += Calificacion;
        }
        promedio = suma / numCalificaciones;
        JOptionPane.showMessageDialog(null,"El promedio de las aclificacione es;"+promedio);
    }
}
