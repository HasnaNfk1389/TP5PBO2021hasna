/*
 * Saya Hasna Nadaa Fida Karima mengerjakan Tp dalam mata kuliah DPBO
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah di spesifikasikan.
 * Aamiin.
 */
package modulgame;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas {
    
    JFrame frame;
    
    public Window(int width, int height, String title, Game game){
        frame = new JFrame(title);
        
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }
    
    public void CloseWindow(){
        frame.setVisible(false);
    }
}
