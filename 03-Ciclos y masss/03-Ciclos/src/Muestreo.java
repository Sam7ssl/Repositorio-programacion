import javax.swing.*;

public class Muestreo {
    public static void main(String[] args) {
        //
        int edad=0;
        double promedioPesoN=0.0,promedioPesoJ=0.0, promedioPesoA=0.0,promedioPesoV=0.0;
        int numPersonas=0;
        double peso=0.0;
        double suma=0.0;
        //
        numPersonas=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de personas "));
        //
        for (int i = 0; i <=numPersonas; i++) {
            if (edad>=0 && edad<=12);
            peso=Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el peso de la persona"));
            suma+=peso;
        }
        promedioPesoN=suma/numPersonas;
        for (int i = 0; i <=numPersonas; i++) {
            if (edad>=13 && edad<=29);
            peso=Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el peso de la persona"));
            suma+=peso;
        }
        promedioPesoJ=suma/numPersonas;
        for (int i = 0; i <=numPersonas; i++) {
            if (edad>=30 && edad<=59);
            peso=Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el peso de la persona"));
            suma+=peso;
        }
        promedioPesoA=suma/numPersonas;
        for (int i = 0; i <=numPersonas; i++) {
            if (edad>60);
            peso=Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese el peso de la persona"));
            suma+=peso;
        }
        promedioPesoV=suma/numPersonas;
        JOptionPane.showMessageDialog
                (null,"El promedio de peso de los NIÑOS es\n;" +promedioPesoN+"El promedio de peso de los JOVENES es\n;"
                +promedioPesoJ+"El promedio de peso de los ADULTOS es\n;"
                +promedioPesoA+"El promedio de peso de los VIEJOS es\n;"
                +promedioPesoV);
        }
    }

