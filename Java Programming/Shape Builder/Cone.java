//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Cone shape and functions

public class Cone {
	public Cone() {
	}
	
	public double volume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * (height/3.0);
	}
}
