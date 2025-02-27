import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        int numTrabajadores =0;
        int numHorasTrabajadas =0;
        int numHorasExtra=0;
        double salarioTotal=0.0;
        String salida="";

        numTrabajadores=Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de trabajadores"));
        salida="Reporte de salarios semanales\n"+
        "Empleado   "+"Horas trabajadad  "+
        "Horas extra  "+"Salario total\n";
        i=1;
        while (i<=numTrabajadores){
            numHorasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog
                    ("Numero de horas trabajadas"));
            numHorasExtra=0;
            if (numHorasTrabajadas<=40){
                salarioTotal=numHorasTrabajadas*20;
                salida+="Empleado "+i+"  "+numHorasTrabajadas+"   "+numHorasExtra+"   "+salarioTotal+"\n";
            }else {
                numHorasExtra=numHorasTrabajadas-40;
                salarioTotal=40*20+numHorasExtra*25;
                salida+="Empleado "+i+"  "+numHorasTrabajadas+"   "+numHorasExtra+"   "+salarioTotal+"\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
