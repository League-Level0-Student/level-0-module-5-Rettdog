/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Code4Life {
	public static void main(String[] args) {
		
	
    
String answer = JOptionPane.showInputDialog("How many hours did you program this week?");
int me = Integer.parseInt(answer);{
if(me<=2) {
	JOptionPane.showMessageDialog(null, "Stop watching youtube amd write a code to do that for you.");
}else if(me<=5) {
	JOptionPane.showMessageDialog(null, "You are a code Ninja");
}else {
	playBatmanTheme();
}
	
}
	}
    private static void playBatmanTheme() {
    	try {
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
   		 clip.start();
   		 Thread.sleep(60002);
   	} catch (Exception ex) {
     	ex.printStackTrace();
   	}
    }


}