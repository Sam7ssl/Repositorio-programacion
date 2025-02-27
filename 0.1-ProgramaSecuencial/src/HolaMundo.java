import javax.swing.*;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        double e1 = 2+5*3/2.0+5*(2+2);
        System.out.println(e1);

        String salida;
        double r=0, r2=0, r3=0;
        double a =0, y=0, z=0, x=0, b=0;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de a: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de y: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de z: "));
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de x: "));

        r = Math.pow(a+ Math.pow(y, z+1) / (x-1), 2);
        r2 = Math.pow(Math.sqrt(Math.pow(a-b,2)) / (4*x),z-1);
        r3 = 1/(Math.sqrt(Math.pow(x,2))) - (4*x);

        salida = "El resultado de la exprecion 1 es : " + r +
                 "\nEl resultado de la exprecion 2 es : "+ r2 +
                 "\nEl resultado de la exprecion 3 es : "+ r3;

        JOptionPane.showMessageDialog(null, "El resultado de la expresion es: " + r);


    }
}
