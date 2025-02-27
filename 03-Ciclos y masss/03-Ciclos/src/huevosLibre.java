import javax.swing.*;

public class huevosLibre {
    public static void main(String[] args) {
        //
        int n = 0;
        double peso = 0.0;
        double altura = 0.0;
        int huevos = 0;
        double calidad = 0.0;
        double sumaCalidad = 0.0;
        double promedioCalidad = 0.0;
        double precioKilo = 0.0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de gallinas"));
        for (int i = 1; i <= n; i++) {
            //
            peso = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el peso de la gallina " + i));
            altura = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese la altura de la gallina " + i));
            huevos = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el número de huevos que pone la gallina " + i));
            //
            calidad = (peso * altura) / huevos;
            sumaCalidad += calidad;
        }
        //
        promedioCalidad = sumaCalidad / n;
        //
        if (promedioCalidad >= 15) {
            precioKilo = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8 && promedioCalidad < 15) {
            precioKilo = 1.00 * promedioCalidad;
        } else {
            precioKilo = 0.80 * promedioCalidad;
        }
        //
        JOptionPane.showMessageDialog
                (null, "El promedio de calidad de las gallinas es: " + promedioCalidad);
        JOptionPane.showMessageDialog
                (null, "El precio por kilo de huevo es: $" + precioKilo);
    }
}