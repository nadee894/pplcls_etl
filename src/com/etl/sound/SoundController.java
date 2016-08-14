/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.sound;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SoundController {

    AudioStream audioStream;

    public void playSound(final String fileName) throws FileNotFoundException, IOException, LineUnavailableException, UnsupportedAudioFileException {
        new Thread(new Runnable() {

            @Override
            public void run() {
                URL url = getClass().getResource("/com/etl/sound/" + fileName);
                AudioStream audioStream = null;
                try {
                    audioStream = new AudioStream(url.openStream());
                } catch (IOException ex) {
                    Logger.getLogger(SoundController.class.getName()).log(Level.SEVERE, null, ex);
                }
                AudioPlayer.player.start(audioStream);
            }
        }).start();

    }

    /*
     * public void aboutLoop() {
     *
     *
     *
     *
     * String s="aboutsound.wav"; URL url2 =
     * getClass().getResource("/sound/"+s); AudioStream as = null; try { as =
     * new AudioStream(url2.openStream()); AudioData audioData = as.getData();
     * ContinuousAudioDataStream cas = new ContinuousAudioDataStream(audioData);
     * AudioPlayer.player.start(cas); } catch (IOException ex) {
     * Logger.getLogger(SoundController.class.getName()).log(Level.SEVERE, null,
     * ex); } }
     */
    public void aboutSound() {
        URL url = getClass().getResource("aboutsound.wav");
        try {
            audioStream = new AudioStream(url.openStream());
        } catch (IOException ex) {
            Logger.getLogger(SoundController.class.getName()).log(Level.SEVERE, null, ex);
        }
        AudioPlayer.player.start(audioStream);
    }

    public void stopAboutSound() {
        AudioPlayer.player.stop(audioStream);
    }
}
