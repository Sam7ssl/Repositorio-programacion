import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {
        double numcal=0.0, cal=0.0, prom=0.0;
        numcal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero de calificaciones: "));

        for (int i=0; i<numcal; i++ ){
            cal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion: "));
            System.out.println("La calififcacion es ;"+cal);
        }
        prom=cal/numcal;
        System.out.println("La calififcacion es ;"+prom);
    }
}
