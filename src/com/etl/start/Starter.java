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
import com.etl.views.SplashScreen;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
            
            
            SplashScreen.run();
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
