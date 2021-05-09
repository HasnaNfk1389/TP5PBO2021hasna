/*
 * Saya Hasna Nadaa Fida Karima mengerjakan Tp dalam mata kuliah DPBO
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah di spesifikasikan.
 * Aamiin.
 */
package modulgame;

import java.awt.Color;
import java.awt.Graphics;

public class Items extends GameObject {
    
    public Items(int x, int y, ID id){
        super(x, y, id);
       
        //speed = 1;
    }

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.decode("#f5c542"));
        g.fillRect(x, y, 20, 20);
    }
    
}
