//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Rectangle shape, functions, and draw

import java.awt.Graphics;
import javax.swing.JPanel;

public class Rectangle extends JPanel {
	
	public double x, y;
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double area(double length, double width) {
		return length * width;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect((getSize().width/2)-(int)x/2, (getSize().height/2)-(int)y/2, (int)x, (int)y);
	}
}
