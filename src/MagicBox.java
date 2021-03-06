/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	
	 // We are going to hide secrets within the magic box. 
	 //When the user clicks on a secret place, stuff will happen.
	 
	 // 1. Make the frame respond to mouse clicks.
	
	 // 2. When the mouse is clicked, use the Media Palace (read the code in the default package) to play sounds, show images or speak.
	 
	 //3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		System.out.println("a");
		SwingUtilities.invokeLater(new MagicBox());

		
		
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		frame.addMouseListener(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}
	MediaPalace palace = new MediaPalace();
	
	@Override
	public void mouseClicked(MouseEvent e) {
if(e.getX()>367&&e.getX()<418&&e.getY()>342&&e.getY()<378) {
	palace.speak("Mr zee acquires shiny objects");
}
if(e.getX()>85&&e.getX()<120&&e.getY()>912&&e.getY()<931) { System.out.println("a");
palace.loadSound("moo.wav").play();
}
if(e.getX()>254&&e.getX()<295&&e.getY()>677&&e.getY()<706) {
	JFrame frame = new JFrame();
	frame.add(palace.loadImageFromWithinProject("sheggy.jpg"));
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setBounds(300, 300, 300, 300);
}
/*x=367,y=342
x=418,y=378
x=85,y=912
x=120,y=931
x=254,y=677
x=295,y=706*/

		// TODO Auto-generated method stub
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x="+e.getX()+",y="+e.getY());
		}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


