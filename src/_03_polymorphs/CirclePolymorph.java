package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	CirclePolymorph(int x, int y){
		super(x, y);
	}
	
	double counter = 0;

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, super.getWidth(), super.getHeight());
	}
	
	public void update() {
		counter+=0.1;		
		x += Math.cos(counter)*100.0;
		y += Math.sin(counter)*100.0;
	}
}
