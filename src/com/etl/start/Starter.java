/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.start;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.etl.views.Login;
import com.etl.views.Main;

/**
 *
 * @author Gaya
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String[] li = {"Licensee=Alvaro Duran Tovar  ", "LicenseRegistrationNumber=------", "Product=Synthetica", "LicenseType=Commercial", "ExpireDate=--.--.----", "MaxVersion=2.999.999"};
            UIManager.put("Synthetica.license.info", li);
            UIManager.put("Synthetica.license.key", "7C970FF4-E59D6AF5-8376C987-6F82C092-8377BB97");
            
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            
            //new Login().setVisible(true);
            new Main().setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
