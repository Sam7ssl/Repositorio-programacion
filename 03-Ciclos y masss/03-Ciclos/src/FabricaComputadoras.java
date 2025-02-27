import javax.swing.*;

public class FabricaComputadoras {
    public static void main(String[] args) {
        int numComputadoras=0, preComputadoras=11000;
        double total=0.0, preFinal=0.0;

        numComputadoras=Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de computadoras compradas"));

        if (numComputadoras<5);
            total=preComputadoras*.10;
            preFinal=preComputadoras-total;
            if (numComputadoras>=5 && numComputadoras<10);
                total=preComputadoras*.20;
                preFinal=preComputadoras-total;
                if (numComputadoras>10);
                    total=preComputadoras*.40;
                    preFinal=preComputadoras-total;

        JOptionPane.showMessageDialog(null,
                "El precio a pagar es: " + preFinal);
    }
}
