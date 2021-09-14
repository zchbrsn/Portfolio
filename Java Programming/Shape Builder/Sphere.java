//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Sphere shape and functions

public class Sphere {
	public Sphere() {
	}
	 
	public double volume(double radius) {
		return ((4.0/3.0)* Math.PI) * Math.pow(radius, 3);
	}
}
