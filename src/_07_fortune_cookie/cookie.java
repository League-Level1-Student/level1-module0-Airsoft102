package _07_fortune_cookie;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class cookie {
	  public void showButton() {
          System.out.println("Button clicked");
          JFrame frame=new JFrame();
          frame.setVisible(true);
          JButton button = new JButton();
          frame.add(button);
          frame.pack();
          button.addActionListener((ActionListener) this);
}
}
 