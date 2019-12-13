package _08_jack_in_the_box;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import _07_fortune_cookie.cookie;

public class jack implements ActionListener {JButton  button= new JButton();
int i=0;
private void showPicture(String fileName) {
    try {
        JLabel imageLabel = createLabelImage(fileName);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(imageLabel);
        frame.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
	try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
}
public static void main(String[] args) {
	
	 new jack().showButton();
	
	
}
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame=new JFrame();
        frame.setVisible(true);
        
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
	
		
      
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed==button) {
		i++;
		if (i==5) {
			showPicture("jackInTheBox.png");
		}
	}
	
}
}

