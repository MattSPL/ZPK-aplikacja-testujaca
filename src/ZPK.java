//import javafx.scene.paint.Color;
import java.awt.Color;
import java.awt.color.*;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZPK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sevenseg alfa = new Sevenseg();
		
		alfa.setPrimaryColor(Color.red);
		alfa.setSecondaryColor(Color.red.darker().darker().darker());
		//alfa.createDigit(15);
		try {
			//alfa.createDigit(0);
		//	alfa.createDigit(1);
		//	alfa.createDigit(2);
		//	alfa.createDigit(3);
		//	alfa.createDigit(4);
			
			
			ImageIcon digit = new ImageIcon("1.png");
			ImageIcon digit2 = new ImageIcon("2.png");
			//JLabel height= new JLabel(digit, digit.getIconHeight());
			JLabel dig1 = new JLabel(digit);
			JLabel dig2 = new JLabel(digit2);
			JFrame frame = new JFrame();
			//JLabel label = new JLabel(System.getProperty("User.dir"));
			frame.setSize(200, 200);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.add(dig2);
			System.out.print("Przed whileem");
			while(true)
			{
			frame.remove(dig2);
			frame.repaint();
			frame.add(dig1);
			frame.repaint();
			Thread.sleep(1000);
			frame.remove(dig1);
			frame.repaint();
			frame.add(dig2);
			frame.repaint();
			Thread.sleep(1000);
			
			}
			//System.out.println(System.getProperty("user.dir"));
			
			//frame.add(label);
		//	frame.add(height);
			
			
			//frame.pack();
			
			//frame.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.exit(0);
		
	}

}
