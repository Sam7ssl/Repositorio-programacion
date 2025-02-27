import javax.swing.*;

public class Supermercado {
    public static void main(String[] args) {
        double total = 0.0;
        boolean continuar = true;

        while (continuar) {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo: "));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos: "));
            double costoArticulo = precio * cantidad;
            total += costoArticulo;

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro artículo?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null, "El total de su compra es: $" + total);
    }
}
