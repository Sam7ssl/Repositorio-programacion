import javax.swing.*;

//
public class Escuela {
    public static void main(String[] args) {

        double prom=0.0;
        int reprobadas=0;
        double descuento=0.0;
        int colegiaturaPrepa = 180;
        int colegiaturaProfeional = 300;
        int nivelAcademico=0;
        int materiasCursables=0, materiasPagar;
        double totalPagar=0.0, pagar=0.0;

        //
        nivelAcademico=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el nivel academico del alumno\n1=Preparatoria\n2=Profecional"));
        prom=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese el promedio del alumno"));
        reprobadas=Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de materias reprobadas del alumno"));

        //
        if (prom>=9.5){
            if (nivelAcademico==1);
                materiasCursables=55;
                descuento=colegiaturaPrepa*0.25;
                pagar=colegiaturaPrepa-descuento;
                materiasPagar=materiasCursables/5;
                totalPagar=materiasPagar*pagar;
                JOptionPane.showMessageDialog
                        (null,"Total a pagar\n"+totalPagar
                                +"\nMaterias Cursables\n" + materiasCursables);
        }else if (prom>=9 && prom<9.5) {
            if (nivelAcademico == 1) ;
            materiasCursables = 50;
            descuento = colegiaturaPrepa * 0.10;
            pagar = colegiaturaPrepa - descuento;
            materiasPagar = materiasCursables / 5;
            totalPagar = materiasPagar * pagar;
            JOptionPane.showMessageDialog
                    (null, "Total a pagar\n" + totalPagar
                            + "\nMaterias Cursables\n" + materiasCursables);
        }else if (prom>=7 && prom<9) {
            if (nivelAcademico == 1) ;
            materiasCursables = 50;
            pagar = colegiaturaPrepa;
            materiasPagar = materiasCursables / 5;
            totalPagar = materiasPagar * pagar;
            JOptionPane.showMessageDialog
                    (null, "Total a pagar\n" + totalPagar
                            + "\nMaterias Cursables\n" + materiasCursables);
        }else if (prom<7) {
            if (nivelAcademico == 1) ;
            } else if (reprobadas > 0 && reprobadas<=3) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
                materiasCursables = 45;
                pagar = colegiaturaPrepa;
                materiasPagar = materiasCursables / 5;
                totalPagar = materiasPagar * pagar;
                JOptionPane.showMessageDialog
                        (null, "Total a pagar\n" + totalPagar
                                + "\nMaterias Cursables\n" + materiasCursables);

        }else if (prom<7) {
            if (nivelAcademico == 1) ;
            }else if (reprobadas > 4) {
                JOptionPane.showMessageDialog(null, "NEGATIVO");
                materiasCursables = 40;
                pagar = colegiaturaPrepa;
                materiasPagar = materiasCursables / 5;
                totalPagar = materiasPagar * pagar;
                JOptionPane.showMessageDialog
                        (null, "Total a pagar\n" + totalPagar
                                + "\nMaterias Cursables\n" + materiasCursables);
        }else if (prom>=9.5) {
            if (nivelAcademico == 2) ;
            materiasCursables = 55;
            descuento = colegiaturaPrepa * 0.20;
            pagar = colegiaturaPrepa - descuento;
            materiasPagar = materiasCursables / 5;
            totalPagar = materiasPagar * pagar;
            JOptionPane.showMessageDialog
                    (null, "Total a pagar\n" + totalPagar
                            + "\nMaterias Cursables\n" + materiasCursables);
        }else if (prom<9.5) {
            if (nivelAcademico == 2) ;
            materiasCursables = 55;
            pagar = colegiaturaPrepa;
            materiasPagar = materiasCursables / 5;
            totalPagar = materiasPagar * pagar;
            JOptionPane.showMessageDialog
                    (null, "Total a pagar\n" + totalPagar
                            + "\nMaterias Cursables\n" + materiasCursables);
        }
    }
}
