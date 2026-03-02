
package game_main;
import game_component.Panel_game;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        init();
    }

    private void init() {
        setTitle("MilkyBlast");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Panel_game Panel_game = new Panel_game();
        add(Panel_game);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
