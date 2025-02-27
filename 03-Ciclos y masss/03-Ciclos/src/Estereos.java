import javax.swing.*;

//Un proveedor de estéreos ofrece un descuento del 10% sobre el precio sin IVA,
// de algún aparato si este cuesta $2000 o mas. Además, independientemente de esto, ofrece un 5% de descuento
// si la marca es "NOSY".
// Determinar cuanto pagara, con IVA incluido, un cliente cualquiera por la compra de su aparato.
public class Estereos {
    public static void main(String[] args) {
        double Aparato=0.0;
        double Descuento=0.0;
        double preFinal=0.0;
        double Final =0.0, iva=0.0;
        String Marca= "";

        Aparato=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingresa el precio del aparato"));
        Marca = JOptionPane.showInputDialog("Ingrese la marca del aparato:");

        if (Aparato>=2000) {
            Descuento = Aparato * 0.10;
        }
        if (Marca.equalsIgnoreCase("NOSY")) {
            Descuento += Aparato * 0.05;
        }
        preFinal=Aparato-Descuento;
        iva=preFinal*0.16;
        Final=preFinal+iva;
        JOptionPane.showMessageDialog
                (null,"El precio final es; " + Final);
        }

}
