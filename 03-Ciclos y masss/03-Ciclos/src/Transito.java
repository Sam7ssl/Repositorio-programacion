import javax.swing.*;

public class Transito {
    public static void main(String[] args) {
        //Declaracion de variables
        int numAuto = 0;
        int amarillo = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;
        int matricula = 0;


        numAuto = Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de autos"));
        int x = 1;
        while (x <= numAuto) {
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimonumero de la matricula"));
            if (matricula >= 1 && matricula <= 2) {
                amarillo++;
            } else if (matricula >= 3 && matricula <= 4) {
                rosa++;
            } else if (matricula >= 5 && matricula <= 6) {
                roja++;
            } else if (matricula >= 7 && matricula <= 8) {
                verde++;
            } else if (matricula >= 0 && matricula <= 9) {
                azul++;

            } else {
                JOptionPane.showMessageDialog(null, "El numero el incorrecto");

            }
            x++;
        }
        JOptionPane.showMessageDialog(null, "El numero de autos con estampilla amarilla es  : "
                + amarillo + "\n El numero de autos con estampilla rosa es  : " + rosa +
                "\nEl numero de autos con estampilla roja es  : "
                + roja + "\nEl numero de autos con estampilla verde es  : "
                + verde + "\nEl numero de autos con estampilla azul es  : "
                + azul);
    }
}