//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Circle shape, functions, and draw

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel {
	
	public double x, y;
		
	public Circle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double area(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval((getSize().width/2)-(int)x/2, (getSize().height/2)-(int)y/2, (int)x, (int)y);
	}
}