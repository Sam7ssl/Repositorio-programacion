//Hacer un programa que lea un número en pies y calcule e imprima su equivalente en
//yardas, pulgadas, centímetros y metros, de acuerdo con las siguientes equivalencias: 1
//pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm
import javax.swing.*;
public class PieYardaPulgadaMetro {
    public static void main(String[] args) {

        double pulgadas=0, pies=0, yardas=0, centimetros=0, metros=0;

        pies =Double.parseDouble(JOptionPane.showInputDialog("Ingresar la distancia en pies: "));

        pulgadas = pies * 12;
        yardas = pies / 3;
        centimetros = pulgadas * 2.54;
        metros = centimetros / 100;

        JOptionPane.showMessageDialog(null, "pies equivale a : " + pies
                +"yardas equivale a : "+String.format("%.2f", yardas)
                +"centimetros equivale a : "+String.format("%.2f", centimetros)
                +"metros equivale a : "+String.format("%.2f", metros));
    }
}
