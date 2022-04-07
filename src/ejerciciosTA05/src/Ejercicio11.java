import java.util.Scanner; // Sin esto no podemos usar el Scanner

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el día de la semana:");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		String diaSemanaUsuario = sc.nextLine(); // Guardo la informacion enviada por teclado en este String
		switch (diaSemanaUsuario) {
		case "Lunes":
			System.out.println("Día laboral");
			
			break;
		case "Martes":
			System.out.println("Día laboral");
			
			break;
		case "Miércoles":
			System.out.println("Día laboral");
			
			break;
		case "Jueves":
			System.out.println("Día laboral");
			
			break;
		case "Viernes":
			System.out.println("Día laboral");
			
			break;
		case "Sábado":
			System.out.println("Día no laboral");
			
			break;
		case "Domingo":
			System.out.println("Día no laboral");
			
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
