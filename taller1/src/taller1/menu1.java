package taller1;
import java.util.Scanner;
public class menu1 {
	private static String op1 (string usuario, string contraseña) {
		
		System.out.print("Usuario: ");
		string nombre1 = s.nextLine();
		System.out.print("Contraseña: ");
		string contraseña1 = s.nextLine();
			
		if (nombre1 == usuario && contraseña1 == contraseña)
			return "Ingreso Correcto!";
		return "Ingreso Incorrecto";
				
			
			
	}

	public static void main(String[] args) {
		
		
		string usuario = "martin";
		string contraseña = "gatito123";
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1) Menu de Usuarios");
		System.out.println("2) Menu de Analisis");
		System.out.println("3) Salir");
		System.out.print("> ");
		
		int opcion = Integer.valueOf(s.nextLine());
		
		switch (opcion) {
		case 1:
			System.out.println(op1(usuario, contraseña));
			/*System.out.println("escogio caso 1");*/
			break;
		case 2:
			System.out.println("escogio caso 2");
			break;
		case 3:
			System.out.println("adios...");
			break;
		default:
			while (opcion != 1 && opcion != 2 && opcion != 3) {
				System.out.println("Ingrese una opcion valida (1, 2 o 3)");
				opcion = Integer.valueOf(s.nextLine());	
			}
			if (opcion == 1) {
				System.out.println("escogio caso 1");
			}
			if (opcion == 2) {
				System.out.println("escogio caso 2");
			}
			if (opcion == 3) {
				System.out.println("adios...");
			}
			break;
		}
	}

}
