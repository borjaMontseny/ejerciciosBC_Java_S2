import java.util.Scanner; // Sin esto no podemos usar el Scanner

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Introduce el primer valor");
			Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
			int valor1 = sc.nextInt();
			System.out.println("Introduce el segundo valor");
			int valor2 = sc.nextInt();
			System.out.println("Introduce el operador");
			String operadorSeleccionado = sc.next();
			System.out.println("Calculadora IF o SWITCH");
			String eleccionCalculadora = sc.next().toUpperCase();

			if (eleccionCalculadora.charAt(0) == 'S') {
				System.out.println("Has escogido Switch");
				metodoSwitch(valor1, valor2, operadorSeleccionado);
			} else if (eleccionCalculadora.charAt(0) == 'I') {
				System.out.println("Has escogido If");
				metodoIf(valor1, valor2, operadorSeleccionado);

			}
		}
	}

	public static void metodoIf(int valor1, int valor2, String operadorSeleccionado) {
		int resultado = 0;
		if (operadorSeleccionado.charAt(0) == '+') {
			resultado = valor1 + valor2;
			System.out.println("La suma es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '-') {
			resultado = valor1 - valor2;
			System.out.println("La resta es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '*') {
			resultado = valor1 * valor2;
			System.out.println("La multiplicación es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '*') {
			resultado = valor1 * valor2;
			System.out.println("La multiplicación es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '/') {
			resultado = valor1 - valor2;
			System.out.println("La división es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '%') {
			resultado = valor1 % valor2;
			System.out.println("El módulo es " + resultado);
		} else if (operadorSeleccionado.charAt(0) == '^') {
			resultado = (int) Math.pow(valor1, valor2);
			System.out.println("El resultado de la potencia es " + resultado);
		}
	}

	public static void metodoSwitch(int valor1, int valor2, String operadorSeleccionado) {
		int resultado = 0;
		switch (operadorSeleccionado.charAt(0)) {
		case '+':
			resultado = valor1 + valor2;
			System.out.println("La suma es " + resultado);
			break;
		case '-':
			resultado = valor1 - valor2;
			System.out.println("La resta es " + resultado);
			break;
		case '*':
			resultado = valor1 * valor2;
			System.out.println("La multiplicación es " + resultado);
			break;
		case '/':
			resultado = valor1 / valor2;
			System.out.println("La división es " + resultado);
			break;
		case '^':
			resultado = (int) Math.pow(valor1, valor2);

			System.out.println("El resultado de la potencia es " + resultado);
			break;
		case '%':
			resultado = valor1 % valor2;
			System.out.println("El modulo es " + resultado);
			break;

		default:
			break;
		}

	}

}
