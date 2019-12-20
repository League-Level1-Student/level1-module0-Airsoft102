package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tv implements ActionListener {
	public static void main(String[] args) {
tv vt=new tv();
vt.showButton();
	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			
			     playVideo("https://www.youtube.com/watch?v=wKnM_oUDg18");
			
		}
		if (rand == 1) {
playVideo("https://www.youtube.com/watch?v=Y82jDHRrswc");
		}

		if (rand == 2) {
playVideo("https://www.youtube.com/watch?v=WhPvJOnHotE");
		}
		if (rand == 3) {
playVideo("https://www.youtube.com/watch?v=xgS4I-47mJc");
		}
	}
		void playVideo(String videoID) {
		     try {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
	}

}