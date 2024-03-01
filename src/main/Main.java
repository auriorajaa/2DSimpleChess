package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    static ImageIcon logo = new ImageIcon(Main.class.getClassLoader().getResource("res/chess.png"));

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setIconImage(logo.getImage());

        // Add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}
