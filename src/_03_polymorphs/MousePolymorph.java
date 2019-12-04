package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph {
	public MousePolymorph(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

	public void update() {
		
	}

}
