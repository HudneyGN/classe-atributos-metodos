package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public Triangle () {
	}
	
	public Triangle (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		/*double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;*/
	}
}
