/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempuratureconvertergui;

import javax.swing.UIManager;

/**
 *
 * @author kowal_000
 */
public class TempuratureConverterGUIstartup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new TempConvertGUI().setVisible(true);
            }
        });
    }
    
}
