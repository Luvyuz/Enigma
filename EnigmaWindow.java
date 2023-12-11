package EnigmaWindow;
import javax.swing.*;

import java.awt.*;

public class EnigmaWindow extends JFrame{
	public static final int WIDTH = 750;
	public static final int HEIGTH = 750;
	private EnigmaKBPanel enigmaKeyboard;
	public EnigmaWindow(EnigmaKBPanel enigmaKeyboard){
        this.enigmaKeyboard = enigmaKeyboard;
		setLayout(new BorderLayout());
		add(enigmaKeyboard, BorderLayout.CENTER);
		setTitle("Enigma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGTH));
		pack();
		setLocationRelativeTo(null);
	}
}
