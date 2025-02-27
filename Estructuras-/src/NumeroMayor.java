//evaluar si un valor es mayor a 10, utilix¿zando ternario
import javax.swing.*;
public class NumeroMayor {
    public static void main(String[] args) {
        double numero=0.0;
        String salida="";

        //Entrrada
        numero=Double.parseDouble(JOptionPane.showInputDialog("Imtroduce el numero"));

        salida=!(numero>10)?"El numero es mayor a 10":"El numero es menor a 10";
    }
}
