package Bunker;
import java.awt.*;
import javax.swing.*;
public class CharacterGenerato {
    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CHARMAN();
            }
        });
    }

    static void CHARMAN()
    {
        JFrame frame = new CHARINFO();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);
    }

}
