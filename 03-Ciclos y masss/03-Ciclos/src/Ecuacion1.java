import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //Decraracion de variables
        int n = 0;
        int denSup = 0;
        int deno = 0;
        double x = 0.0, s = 0.0;

        do{

            n = Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de la fraccion"));
            if (n>0);

            x = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce el valor de x"));

        }while(n<0.0 || x<0.0);

        //inicializar variables

        denSup=3;
        deno=1;

        for (int i = 0; i < n; i++) {
            s+=Math.pow(x,3.0/denSup)/deno;
            denSup+=3;
            deno+=2;

            JOptionPane.showMessageDialog(null,
                    "El valor de S:"+
                    String.format("%.4f",s));

        }

    }
}
