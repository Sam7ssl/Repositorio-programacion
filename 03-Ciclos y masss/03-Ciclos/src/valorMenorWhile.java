import javax.swing.*;

public class valorMenorWhile {
    public static void main(String[] args) {
        //
        int n=0;
        double numero=0.0, menor=0.0;
        //
        n=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese la cantidad de numeros "));
        //
        menor=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un numero "));
        int i=2;
        while (i<=n){
            numero=Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese un numero"));
            if (numero<menor){
                menor=numero;
        }
        i++;
        }
        JOptionPane.showMessageDialog(null,"El numero menor es;"+menor);

    }
}
