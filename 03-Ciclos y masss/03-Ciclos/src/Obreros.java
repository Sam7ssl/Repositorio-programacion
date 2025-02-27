import javax.swing.*;

public class Obreros {
    public static void main(String[] args) {

        //Declaracion de variables
        double saldo = 0.0;
        double prestamo = 0.0;
        double equipoComputo = 0.0;
        double mobiliario = 2000.0;
        double compraInsumos = 0.0;
        double insentivoPersonal = 0.0;
        String salida;

        //Solicitar saldo
        saldo = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce el saldo"));

        if (saldo < 0.0) {
            prestamo = 10000.0;

        } else if (saldo > 0.0 && saldo < 20000.0) {
            prestamo = (20000.0 - saldo);
        } else {
            prestamo = saldo;
        }
        equipoComputo = 5000;
        prestamo -= equipoComputo;
        prestamo -= mobiliario;
        compraInsumos = prestamo / 2.0;
        prestamo -= compraInsumos;
        insentivoPersonal = prestamo;

        salida = "Resultado\n" +
                "Compra de insumos; " + compraInsumos +
                "\nInsentivo del personal: " + insentivoPersonal +
                "\n Euipo de computo " + equipoComputo +
                "\n Mobiliario " + mobiliario;
        JOptionPane.showMessageDialog(null, salida);
    }
}