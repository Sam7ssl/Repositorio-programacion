import javax.swing.*;

public class tablaMultiplicacion {
    public static void main(String[] args) {
        //
        int numero=0;
        String salida="";
        //
        numero=Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingrese el numero que dese su tabla de multiplicacion "));
        //
        for (int i = 1; i <=10; i++) {
            salida+=numero+"*"+i+"="+(numero*i)+"\n";
        }
        JOptionPane.showMessageDialog(null,"La tabla;" +
                "\n"+salida);
    }
}
