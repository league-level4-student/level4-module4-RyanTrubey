package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph {

	MovingPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	
	public void update() {
			super.setX(super.getX()+1);
			super.setY(super.getY()+1);
	}

}
