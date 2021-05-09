/*
 * Saya Hasna Nadaa Fida Karima mengerjakan Tp dalam mata kuliah DPBO
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah di spesifikasikan.
 * Aamiin.
 */
package modulgame;

import java.awt.Color;
import java.awt.Graphics;


public class Player extends GameObject{
    
    public Player(int x, int y, ID id){
        super(x, y, id);
        
        //speed = 1;
    }

    @Override
    public void tick() {
        x += vel_x;
        y += vel_y;
        
        x = Game.clamp(x, 0, Game.WIDTH - 60);
        y = Game.clamp(y, 0, Game.HEIGHT - 80);

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.decode("#3f6082"));
        g.fillRect(x, y, 50, 50);
    }
}
