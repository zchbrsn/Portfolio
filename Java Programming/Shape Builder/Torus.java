//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: Torus shape and functions

public class Torus {
	public Torus() {
	}
	
	public double volume (double majRadius, double minRadius) {
		return (Math.PI * Math.pow(minRadius, 2)) * (2 * Math.PI * majRadius);
	}
}
