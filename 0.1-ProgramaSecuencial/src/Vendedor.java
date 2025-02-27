//Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el
//vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
//
//ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su
//sueldo base y comisiones.
import javax.swing.*;
public class Vendedor {
    public static void main(String[] args) {
        double sue = 0.0, sueTotal=0.0;
        double comision = 0.10, venta1=0.0, venta2=0.0, venta3=0.0;

        sue = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo del vendedor: "));
        venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la venta: "));
        venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la venta: "));
        venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la venta: "));

        sueTotal=(venta1+venta2+venta3)*comision+sue;

        JOptionPane.showMessageDialog(null,
                "El resultado es: " + sueTotal);

    }
}
