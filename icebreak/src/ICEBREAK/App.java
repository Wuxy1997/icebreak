package ICEBREAK;

import javax.swing.JFrame;
import javax.swing.plaf.TreeUI;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("icebreak game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
