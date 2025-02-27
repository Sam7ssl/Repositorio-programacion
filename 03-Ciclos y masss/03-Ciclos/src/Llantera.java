//En una llantera se ha establecido una promoción de las llantas marca "Ponchadas", dicha promoción consiste en lo siguiente:
//Si se compran menos de cinco llantas el precio es de $300 cada una, de $250 si se compran de cinco a 10 y de $200
// si se compran más de 10.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra
// y la que tiene que pagar por el total de la compra.
import javax.swing.*;
public class Llantera {
    public static void main(String[] args) {
        int numLlantas=0, preLlanta=300,total=0;

        numLlantas=Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de llantas compradas"));

        if (numLlantas >=5 || numLlantas<=10) {
            preLlanta=preLlanta-50;

            if (numLlantas >10) ;
                preLlanta=preLlanta-100;

            total=numLlantas*preLlanta;
            JOptionPane.showMessageDialog(null,
                        "El precio a pagar es: " + total);
        }
    }
}
