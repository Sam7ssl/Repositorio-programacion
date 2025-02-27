//Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos,
// un medico determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la sangre
// , de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que el rango que le corresponde,
// se determina su resultado como positivo y en caso contrario como negativo.
// La tabla en la que el medico se basa para obtener el resultado es la siguiente:
import javax.swing.*;
public class AnalisisClinicos {
    public static void main(String[] args) {
        double edad=0;
        int genero=0;
        double hemoglobina=0.0;

        edad=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la edad del paciente"));
        genero=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el genero del paciente\n1=Hombre\n2=Mujer"));
        hemoglobina=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese el nivel de hemoglobina del paciente"));

        if (edad > 0 && edad <= 1) {
            if (hemoglobina < 13) {
                JOptionPane.showMessageDialog(null, "POSITIVO");
            } else if (hemoglobina > 16) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
            }
        } else if (edad > 1 && edad <= 6) {
            if (hemoglobina < 10) {
                JOptionPane.showMessageDialog(null, "POSITIVO");
            } else if (hemoglobina > 18) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
            }
        } else if (edad > 6 && edad <= 12) {
            if (hemoglobina < 11) {
                JOptionPane.showMessageDialog(null, "POSITIVO");
            } else if (hemoglobina > 15) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
            }
        } else if (edad > 12 && edad <= 15) {
            if (hemoglobina < 11.5) {
                JOptionPane.showMessageDialog(null, "POSITIVO");
            } else if (hemoglobina > 15) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
            }
        } else if (edad > 15) {
            if (genero == 1) {
                if (hemoglobina < 14) {
                    JOptionPane.showMessageDialog(null, "POSITIVO");
                } else if (hemoglobina > 18) {
                    JOptionPane.showMessageDialog(null, "NEGATIVO");
                }
            } else if (genero == 2) {
                if (hemoglobina < 12) {
                    JOptionPane.showMessageDialog(null, "POSITIVO");
                } else if (hemoglobina > 16) {
                    JOptionPane.showMessageDialog(null, "NEGATIVO");
                }
            }
        }
    }
}