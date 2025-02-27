//Escribir un programa que convierte los 10, 50 y 100 kilogramos a libras (1 libra = 0,454
//kg).
import javax.swing.*;
public class CovercionLibras {
    public static void main(String[] args) {
        double kg = 0;
        double libra =0.454, r=0;
        String salida;
        int veces = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos pesos quieres convertir?"));

        for (int i = 0; i < veces; i++) {
            kg = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso en kilogramos: "));
            r = (kg / libra);

            JOptionPane.showMessageDialog(null,
                    "El resultado de la conversion es: " + String.format("%.4f", r));
        }
    }
}
