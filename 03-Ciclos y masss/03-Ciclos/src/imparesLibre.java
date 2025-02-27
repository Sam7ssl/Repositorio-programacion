import javax.swing.*;

public class imparesLibre {
    public static void main(String[] args) {
        //
        String impares = "";
        int i = 1;
        //
        while (i <= 100) {
            impares += i + " ";
            i += 2;
        }
        //
        JOptionPane.showMessageDialog
                (null, "Números impares entre 0 y 100:\n" + impares);
    }
}

