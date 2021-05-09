/*
 * Saya Hasna Nadaa Fida Karima mengerjakan Tp dalam mata kuliah DPBO
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah di spesifikasikan.
 * Aamiin.
 */
package modulgame;

import java.awt.Graphics;
import java.util.LinkedList;


public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    
    public void tick(){
        for(int i=0;i<object.size(); i++){
            GameObject tempObject = object.get(i);
            
            tempObject.tick();
        }
    }
    
    public void render(Graphics g){
        for(int i=0;i<object.size(); i++){
            GameObject tempObject = object.get(i);
            
            tempObject.render(g);
        }
    }
    
    public void addObject(GameObject object){
        this.object.add(object);
    }
    
    /**
     *
     * @return
     */
    public boolean EmptyIs(){
        return this.object.isEmpty();
    }
    public void removeObject(GameObject object){
        this.object.remove(object);
    }
}
