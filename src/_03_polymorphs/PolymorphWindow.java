package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
	DialogPolymorph dialogmorph = new DialogPolymorph(90, 90);

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.addMouseMotionListener(this);
		window.addMouseListener(dialogmorph);
		window.pack();
		window.setVisible(true);

		polymorphs.add(new BluePolymorph(50, 50));
		polymorphs.add(new CirclePolymorph(300, 300));
		polymorphs.add(new MovingPolymorph(0, 0));
		polymorphs.add(new MousePolymorph(30, 150));
		polymorphs.add(dialogmorph);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for(Polymorph p : polymorphs) {
			p.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(Polymorph p : polymorphs) {
			p.update();
		}
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		polymorphs.get(3).x = e.getX();
		polymorphs.get(3).y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		polymorphs.get(3).x = e.getX();
		polymorphs.get(3).y = e.getY();
	}
}
