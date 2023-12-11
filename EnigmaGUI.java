package EnigmaWindow;

import java.awt.*;
import javax.swing.*;


public class EnigmaGUI extends JFrame {
        private JPanel mainKBPanel;
        private JPanel topKBPanel;
        private JPanel midKBPanel;
        private JPanel bottomKBPanel;
        private JButton KBtopButtons[];
        private JButton KBmidButtons[];
        private JButton KBbottomButtons[];

    public EnigmaGUI(){
        /* KEYBOARD */
        mainKBPanel = new JPanel(new GridLayout(3,1));
        topKBPanel = new JPanel(new GridLayout(1,9));
        midKBPanel = new JPanel(new GridLayout(1,8));
        bottomKBPanel = new JPanel(new GridLayout(1,9));
        KBtopButtons = new JButton[9];
        KBmidButtons = new JButton[8];
        KBbottomButtons = new JButton[9];
        createButtons();
        addButtons();


        /* KEYBOARD */



        add(mainKBPanel);
        mainKBPanel.add(topKBPanel);
        mainKBPanel.add(midKBPanel);
        mainKBPanel.add(bottomKBPanel);
        setSize(700,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    
    private void addButtons(){
        for(int i = 0; i < KBtopButtons.length; i ++){
            topKBPanel.add(KBtopButtons[i]);
        }
        for(int i = 0; i < KBmidButtons.length; i ++){
            midKBPanel.add(KBmidButtons[i]);
        }
        for(int i = 0; i < KBbottomButtons.length; i ++){
            bottomKBPanel.add(KBbottomButtons[i]);
        }
    }
    private void createButtons(){
        for (int i = 0; i < Keyboard.LAYOUT_KEYBOARDTOP.length; i++) {
            KBtopButtons[i] = new JButton(Keyboard.LAYOUT_KEYBOARDTOP[i]);
        }
        for (int i = 0; i < Keyboard.LAYOUT_KEYBOARDMID.length; i++) {
            KBmidButtons[i] = new JButton(Keyboard.LAYOUT_KEYBOARDMID[i]);
        }
        for (int i = 0; i < Keyboard.LAYOUT_KEYBOARDBOTTOM.length; i++) {
            KBbottomButtons[i] = new JButton(Keyboard.LAYOUT_KEYBOARDBOTTOM[i]);
        }
    }

}
