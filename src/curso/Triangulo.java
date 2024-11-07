package curso;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;


public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle x ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();	
		
		System.out.println("Enter the measures of triangle x ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/*
		double areaX = x.calcularArea();	
		double areaY = y.calcularArea();
		*/	
		
		System.out.printf("Triagle X Area: %.4f\n ", x.calcularArea());
		System.out.printf("Triagle Y Area: %.4f\n ", y.calcularArea());
		
		if(x.calcularArea() > y.calcularArea()) {
			System.out.println("Large area X ");
		}
		else {
			System.out.println("Large area Y ");
		}
		
		sc.close();

	}

}
