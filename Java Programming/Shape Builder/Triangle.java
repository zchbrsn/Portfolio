//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Triangle shape, functions, and draw

import java.awt.Graphics;
import javax.swing.JPanel;

public class Triangle extends JPanel {
	
	public double x, y;
	
	public Triangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double area(double length, double width) {
		return (length * width) / 2;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
		g.drawPolygon(new int[] {getSize().width/2-(int)x, getSize().width/2, getSize().width/2+(int)x}, new int[] {getSize().height/2, getSize().height/2-(int)y, getSize().height/2}, 3);
	}
}
