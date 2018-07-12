/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
          JFrame framedata=new JFrame();
          
		//2. Set your JFrame object to be visible
            framedata.setVisible(true);
		//3. Run your program. Do you see your window? It's probably very small.
		
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
          framedata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//5. Create and initialize an object of the JPanel class
              JPanel ultimate = new JPanel();
		//6. Create and initialize an object of the JLabel class
              JLabel pichu = new JLabel();
		//7. Set the text of the JLabel to a lovely greeting.
           pichu.setText("I'm a pichu main get on my level");
		//8. Add the JPanel object to the JFrame
          framedata.add(ultimate);
		//9. Add the JLabel object to the JPanel
             ultimate.add(pichu);
		//10. Pack your JFrame.
        framedata.pack();
		//11. Run your program again. Do you see your message.
		
		//12. Use the loadImage method to set the icon of the JLabel object.  
          pichu.setIcon(loadImage());
		//13. Re-pack the JFrame object.
	   framedata.pack();
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
