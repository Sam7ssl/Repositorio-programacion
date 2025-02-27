import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //Declarion de Variables
        String menu = "";
        String opcion = "";
        boolean sentinal = true;

        //Creacion del menu
        menu = "Menu principal\n" +
                "1)Promedio Calificaciones (for)\n" +
                "2)Vendedores (while)\n" +
                "3)Tienda" +
                "\n 4)Salir" +
                "\nElegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    int numCalif = 0;
                    double calif = 0.0;
                    double prom = 0.0;

                    //Solicita el numero de calificacion
                    numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificacion"));
                    for (int i = 0; i <= numCalif; i++) {
                        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));
                        //Acumular calificaciones
                        prom += calif;
                    }

                    prom /= numCalif;
                    JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + prom);
                    break;
                case "2":
                    String nombres = "";
                    int numVendedores = 0;
                    double sueldoBase = 0.0;
                    double comision = 0.0;
                    double sueldoTotal = 0.0;
                    String salida = "";
                    double venta1 = 0.0, venta2 = 0.0, venta3 = 0.0;

                    numVendedores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de vendedores: "));
                    sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo base: "));

                    salida = "Nombre          Comision        Sueldo Total\n";

                    int i = 1;

                    while (i <= numVendedores) {
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del vendedor " + i + ": ");

                        venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 1ra venta: "));
                        venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 2da venta: "));
                        venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 3ra venta: "));

                        comision = (venta1 + venta2 + venta3) * 0.10;

                        sueldoTotal = sueldoBase + comision;

                        salida += nombres + "          " + comision + "        " + sueldoTotal + "\n";
                        i++;

                        JOptionPane.showMessageDialog(null, salida);
                    }
                    break;
                case "3":
                    //Tienda de bolitas
                    String respuesta="", resultado="";
                    boolean sentinel = true;
                    double total =0.0;
                    double descuento=0.0, totalcompra=0.0, importe=0.0;
                    String tipoBolita="";
                    String menuBolitas="Tombola\n"+
                            "a)Bolita roja\n"+
                            "b)Bolita amarilla\n"+
                            "Elegir opcion";
                    resultado="total de ventas\n"+
                            "Total a pagar           "+"Descuento            "+"Importe       \n";

                    do {
                        totalcompra=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo base: "));
                        tipoBolita=JOptionPane.showInputDialog(menuBolitas);
                        if (tipoBolita.equalsIgnoreCase("a")
                                || tipoBolita.equalsIgnoreCase("b")
                                || tipoBolita.equalsIgnoreCase("c")
                            ) {

                            if (tipoBolita.equalsIgnoreCase("a")) {
                                descuento = totalcompra * 0.40;
                            } else if (tipoBolita.equalsIgnoreCase("b")) {
                                descuento = totalcompra * 0.25;
                            } else  {
                                descuento = 0.0;
                            }
                            importe=totalcompra-descuento;
                            total+=importe;
                            resultado+=totalcompra+"         "+descuento+"     "+importe+"\n";
                        }else {
                            JOptionPane.showMessageDialog(null, "Bolita no valida" );
                        }
                        salida=JOptionPane.showInputDialog("Deseas cerrar la caja sio/no");
                        if (salida.equalsIgnoreCase("si")){
                            sentinel=false;
                        }

                    }while (sentinel);
                    resultado+="Total:   "+total;
                    JOptionPane.showMessageDialog(null,resultado);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Opcion 4");
                    sentinal = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no validaa");


            }
        }while (sentinal) ;

    }
}
