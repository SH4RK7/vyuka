package cz.spsmb.vyuka.zaklady.basic;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ImageExample extends JFrame {

    public ImageExample() {

        initUI();
    }

    private void initUI() {

        add(new BoardImage());

        pack();

        setTitle("FVE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ImageExample ex = new ImageExample();
            ex.setVisible(true);
        });
    }
}
