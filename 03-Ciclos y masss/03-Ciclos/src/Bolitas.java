import javax.swing.*;

public class Bolitas {
    public static void main(String[] args) {
        char continuar;

        do {
            double total = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de su compra"));
            String color = JOptionPane.showInputDialog("Ingrese el color de la bolita (roja, amarilla, blanca)").toLowerCase();

            double descuento = 0;
            if (color.equals("roja")) {
                descuento = 0.40;
            } else if (color.equals("amarilla")) {
                descuento = 0.25;
            } else if (!color.equals("blanca")) {
                JOptionPane.showMessageDialog(null, "Color no válido, no se aplicará descuento.");
            }

            double totalPagar = total - (total * descuento);
            JOptionPane.showMessageDialog(null, "Total a pagar después del descuento: $" + totalPagar);

            continuar = JOptionPane.showInputDialog("¿Hay otro cliente? (s/n)").toLowerCase().charAt(0);

        } while (continuar == 's');

        JOptionPane.showMessageDialog(null, "La tienda ha cerrado.");
    }
}

