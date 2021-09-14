//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Cylinder shape and functions

public class Cylinder {
	public Cylinder() {
	}
	
	public double volume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}
}
