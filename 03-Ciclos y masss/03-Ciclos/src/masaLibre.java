import javax.swing.*;

public class masaLibre {
    public static void main(String[] args) {
        //
        int n=0;
        double sumaMasas=0.0;
        double presion=0.0;
        double volumen=0.0;
        double temperatura=0.0;
        double masa=0.0;
        double promedio=0.0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos"));
        sumaMasas = 0;
        //
        for (int i = 1; i <= n; i++) {
            presion = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese la presión del vehículo " + i));
            volumen = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el volumen del vehículo " + i));
            temperatura = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese la temperatura del vehículo " + i));
        //
            masa = (presion * volumen) / (0.37 * (temperatura + 460));
            sumaMasas += masa;
        }
        //
        promedio = sumaMasas / n;
        JOptionPane.showMessageDialog
                (null, "El promedio de la masa de aire es: " + promedio);
    }
}
