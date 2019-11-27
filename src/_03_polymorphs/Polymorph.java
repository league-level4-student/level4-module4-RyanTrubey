package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 width = 50;
   	 height = 50;
    }
    
    public void update(){
   	 
    }
    
    public int getX() {
    	return x;
    }
    
    public void setX(int a) {
    	x = a;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int a) {
    	y = a;
    }
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public abstract void draw(Graphics g);
}
