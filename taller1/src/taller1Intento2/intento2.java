package taller1Intento2;

import java.util.Scanner;

public class intento2 {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
		int op = 0;
		try {
			
			do {
				System.out.println("1) Menu de Usuarios");
				System.out.println("2) Menu de Analisis");
				System.out.println("3) Salir");
				System.out.print("> ");
				
			
				op = Integer.valueOf(r.nextLine());
				switch (op) {
				case 1:
					System.out.println("Caso 1");
					break;
				case 2:
					System.out.println("Caso 2");
					break;
				case 3:
					System.out.println("adios");
					break;
				default:
					System.out.println("Ingrese una opcion valida (1, 2 o 3)");
				}
			} while (op != 3);
			
		} catch (NumberFormatException e) {
			System.out.println("Error");
		} finally {
			
		}
		
		

	}
}
