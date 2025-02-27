import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Estructurascontrol {
    public static void main(String[] args) {
        //Declaracion de variables

        String opcion = "";
        String menu = "a)Juego\n"+
                "b)Fluteria\n"+
                "c)Laboratorio\n"+
                "d)Salir\n"+
                "Elegir uns opcion: ";

        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion){
            case "A":
                String pregunta = "Colon descrubrio Amaerica";
                String respuesta = JOptionPane.showInputDialog(pregunta +"si/no");
                if (respuesta.equalsIgnoreCase("si")) {
                    respuesta=JOptionPane.showInputDialog
                            ("La independencia de mexico fue en 1810?");
                    if (respuesta.equalsIgnoreCase("si")){

                    }else {
                    JOptionPane.showMessageDialog(null,
                            "Respuesta incorrecta");
                    }
                }else {
                    JOptionPane.showMessageDialog(null,
                            "Respuesta incorrecta");
                }
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                JOptionPane.showMessageDialog(null,
                        "El programa a terminado;");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
    }
}
