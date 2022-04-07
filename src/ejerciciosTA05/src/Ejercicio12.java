import java.util.Scanner; // Sin esto no podemos usar el Scanner

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		String contraseñaCorrecta = "borja"; // Compararemos con esto, que es la contraseña correcta
		int intentos = 0; // Aquí contaremos los intentos

		do {
			System.out.println("Introduce la contraseña:");
			String contraseñaUsuario = sc.nextLine(); // Aquí recojo la contraseña en un String
			if (contraseñaUsuario.equals(contraseñaCorrecta)) { // Comparamos los dos Strings
				System.out.println("La contraseña es correcta. Bienvenido"); // Mensaje si la contraseña es correcta
				intentos = 4; // Esto es para que no detecte mas intentos restantes, si ya hemos acertado
			} else { // Si nos equivocamos
				intentos++; //Se le suma un intento
				System.out.println("La contraseña es incorrecta."); 
				System.out.println("Llevas " + intentos + " intentos"); // Damos Error y dice restantes hasta llegar a 3
			}

		} while (intentos < 3); // Mientras intentos sea menor a 3, volverá a pedir la contraseña
	}
}