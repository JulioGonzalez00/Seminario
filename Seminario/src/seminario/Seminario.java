/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seminario;

import GUI.Principal;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author julio
 */
public class Seminario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            Principal p = new Principal();
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Error:\n" + ex.getMessage());
            System.exit(0);
        }
    }

}
