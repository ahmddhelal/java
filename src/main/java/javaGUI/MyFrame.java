package javaGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() throws HeadlessException {
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(420, 120);
        this.setTitle("Jframe title goes here");
        this.getContentPane().setBackground(new Color(250, 200, 0));
        this.setVisible(true);

        ImageIcon imageIcon = new ImageIcon("D:\\Photos\\IMG_3938.jpeg");
        this.setIconImage(imageIcon.getImage());


    }
}
