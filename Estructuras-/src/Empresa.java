import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        double saldo = 0.0, prestamo = 0.0, equipoComp=0.0, mobilario=2000, compraInsumos=0.0, insentivos=0.0;
        String salida="";
        //Solicitar el saldo
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor"));

        if (saldo < 0.0) {
            prestamo = 1000.0;
        }else if (saldo>0.0 && saldo<2000) {
            prestamo = (20000.0 - saldo);
        }else{
            prestamo=saldo;

        equipoComp=5000;
        prestamo-=equipoComp;
        prestamo-=mobilario;
        compraInsumos=prestamo/2.0;
        prestamo-=prestamo/2.0;
        insentivos=prestamo;

        salida="Resultado\n"+
                "Compra de insumos"+compraInsumos+
                "\nInsentivos del personal"+insentivos;

        JOptionPane.showMessageDialog(null, salida);
        }
    }
}
