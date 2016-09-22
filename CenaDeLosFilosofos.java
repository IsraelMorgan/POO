/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cenadelosfilosofos;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Cristhian
 */
public class CenaDeLosFilosofos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Look and Feel                                  
        try {                       
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en Look an Feel"+ e.getMessage(), null,JOptionPane.ERROR_MESSAGE);
        }        
        Interface inicio = new Interface();                   
    }
}