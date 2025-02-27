import javax.swing.*;

public class obrerosLibre {
    public static void main(String[] args) {
        //
        int n=0;
        double salario=0.0;
        int horas=0;
        double salarioTotal=0.0;
        //
        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de obreros"));
        for (int i = 1; i <= n; i++) {
            horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas del obrero " + i));
            if (horas <= 40) {
                salario = horas * 20;
            } else {
                salario = (40 * 20) + ((horas - 40) * 25);
            }
            //
            salarioTotal += salario;
            JOptionPane.showMessageDialog
                    (null, "El salario del obrero " + i + " es: $" + salario);
        }
        //
        JOptionPane.showMessageDialog
                (null, "El salario total de todos los obreros es: $" + salarioTotal);
    }
}
