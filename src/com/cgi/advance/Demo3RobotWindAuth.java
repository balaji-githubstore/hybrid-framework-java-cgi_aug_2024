package com.cgi.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Demo3RobotWindAuth {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		  Robot robot = new Robot();
		  
		  Thread.sleep(5000);
		  
//		  robot.keyPress(KeyEvent.VK_A);
//		  
//		  robot.keyPress(KeyEvent.VK_TAB);
//		  robot.keyPress(KeyEvent.VK_A);
//		  
//		  robot.keyPress(KeyEvent.VK_A);
	        // The String to type
	        String str = "jack";
	        // Press keys using robot
	        // A gap of 200ms is added between each key press
	        for (int i = 0; i < str.length(); i++) {
	            
	        	robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(str.charAt(i)));
	        }
	        
	  	  robot.keyPress(KeyEvent.VK_TAB);
	  	  
	  	  
	        String str1 = "jack233";
	        // Press keys using robot
	        // A gap of 200ms is added between each key press
	        for (int i = 0; i < str1.length(); i++) {
	            
	        	robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(str1.charAt(i)));
	        }
	}

}
