import javax.swing.*;

public class CalificacionesSentinel {
    public static void main(String[] args) {
        final int Sentinel=-1;
        double calif =0.0;
        int numAprobados=0;
        int numReprobados=0;

        JOptionPane.showMessageDialog(null,
                "Este programa cuenta el mumero de calificaciones aprobatorias y reprobatorias"+
                "\nPara identificar una calificacion con -1");

        int x=1;
        while (calif!=Sentinel){
            calif = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingresa la calificacion" +x));

            if (calif!=Sentinel){
                numAprobados++;
            }else{
                numReprobados++;
            }
            x++;
        }
        JOptionPane.showMessageDialog(null,
                "El numero de aprobados es ;" + numAprobados +
                        "\nEl numero de reprobados es :" + numReprobados);
    }
}
