import javax.swing.*;

public class promedades {
    public static void main(String[] args) {
        //
        int numAlumnos=0;
        double sumaEdadHombres=0.0;
        double sumaEdadMujeres=0.0;
        int numHombres=0;
        int numMujeres=0;
        int edad;
        int genero;
        double promHombres=0.0;
        double promMujeres=0.0;
        double promTotal=0.0;
        String salida = "";
        double coso = 0.0;
        //
        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de alumnos "));
        //
        coso=numAlumnos;
        //
        while (numAlumnos>0) {
            edad = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese la edad del alumno "));
            genero = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el genero del alumno: \n1=Hombre\n2=Mujer"));
            if (genero == 1) {
                sumaEdadHombres += edad;
                numHombres++;
            } else if (genero == 2) {
                sumaEdadMujeres += edad;
                numMujeres++;
            }
            numAlumnos--;
        }
        promHombres=sumaEdadHombres/numHombres;
        promMujeres=sumaEdadMujeres/numMujeres;
        promTotal=((sumaEdadHombres+sumaEdadMujeres)/coso);
        //
        salida =
                "El promedio de edades de los hombres es:"+promHombres
        +"\nEl promedio de edades de las mujeres es:"+promMujeres
        +"\nEl promedio total de todaslas edades es:"+promTotal;
        JOptionPane.showMessageDialog(null, salida);

    }
}
