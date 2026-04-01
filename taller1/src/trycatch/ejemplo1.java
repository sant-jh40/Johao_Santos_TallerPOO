package trycatch;
import java.util.Scanner;
public class ejemplo1 {

	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("Ingrese distancia 1");
		int d1 = Integer.valueOf(scaner.nextLine());
		
		System.out.println("Ingrese distancia 2");
		int d2 = Integer.valueOf(scaner.nextLine());
		
		try {
			int dt = sumaDistancias(d1, d2);
			System.out.println("Distancia total: " + dt);
		} catch (IllegalArgumentException e) {
			System.out.println("Error sumando distancias: " + e.getMessage());
		}
		scaner.close();
	}

	private static int sumaDistancias(int d1, int d2) {
		if (d1 < 0)
			throw new IllegalArgumentException("Distancia 1 no puede ser negativa");
		if (d2 < 0)
			throw new IllegalArgumentException("Distancia 2 no puede ser negativa");
		return d1 + d2;
	}
}
