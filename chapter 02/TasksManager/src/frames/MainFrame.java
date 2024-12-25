package frames;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	
	public int BACKGROUND_COLOR = 0x456798; //  A hexadecimal color value
	public int FONT_COLOR = 0xFFFFFF;
	
	public String FONT_FAMILY = "MV Boli";

	public MainFrame() {
		
		ImageIcon image1 = new ImageIcon("./resources/tasks.png");
		
		JLabel label = new JLabel("Tasks Organizer:");
		label.setForeground(new Color(FONT_COLOR));
		label.setIcon(image1);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(new Font(FONT_FAMILY, Font.PLAIN, 20));
		this.add(label);
		
		this.setSize(420, 420);
		this.setTitle("My Application1");
		this.setResizable(false);
		this.setVisible(true);
	
		ImageIcon image2 = new ImageIcon("./resources/icon.png");
		this.setIconImage(image2.getImage());
		
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.getContentPane().setBackground(new Color(BACKGROUND_COLOR));  
		

		
	}
	
}
