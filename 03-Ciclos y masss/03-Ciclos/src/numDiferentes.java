import javax.swing.*;

//Que lea tres números diferentes y determine el numero medio del conjunto de los tres números
// (el numero medio es aquel numero que no es ni mayor, ni menor).
public class numDiferentes {
    public static void main(String[] args) {
        //
        int num1=0;
        int num2=0;
        int num3=0;
        //
        num1=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un numero entero "));
        num2=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un numero entero "));
        num3=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un numero entero "));
        //
        if (num1>num2 && num2>num3) {//3-2-1
            JOptionPane.showMessageDialog
                    (null, "El numero medio es;" + num2);
        }else if (num2>num1 && num1>num3) {//2-3-1
            JOptionPane.showMessageDialog
                    (null, "El numero medio es;" + num1);
        }else if (num3>num2 && num2>num1) {//3-2-1
            JOptionPane.showMessageDialog
                    (null, "El numero medio es;" + num1);
        }
    }
}
