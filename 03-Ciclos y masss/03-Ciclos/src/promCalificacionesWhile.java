import javax.swing.*;

public class promCalificacionesWhile {
    public static void main(String[] args) {
        //
        int numCalificaciones=0;
        int Calificacion=0;
        int suma=0,x=0;
        double prom=0;
        //
        numCalificaciones=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de calificaciones "));
        //
        x=numCalificaciones;
        //
        while (numCalificaciones>0){
            Calificacion = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese la calificacion del alumno "));
            suma+=Calificacion;
            numCalificaciones--;
        }

        prom=suma/x;
        JOptionPane.showMessageDialog
                (null,"El promedio de calificaciones es"+prom);
    }
}
