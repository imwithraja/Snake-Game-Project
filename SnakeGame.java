package snakegame;

import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {

//    JFrame jFrame;
    SnakeGame() {

        super("Snake Game");
        add(new Board());
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null); // to show screen at Centre.
        setResizable(false); // to bund the Resize of the Frame
        setVisible(true); // Show the Frame

    }
    public static void main(String[] args) {
        new SnakeGame();

    }

}
