package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public String toString() {
		//return "A: " + a + ", B: " + b + ", C: " + c + ", Area: " + area();
		return String.format("A: %.2f, B: %.2f, C: %.2f, Area: %.2f", a, b, c, area());
	}
}
