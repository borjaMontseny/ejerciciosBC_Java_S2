import java.util.Scanner; // Sin esto no podemos usar el Scanner

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de ventas:");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int cantidadVentas = sc.nextInt(); // Aquí recojo la información en un String
		int sumaVentas = 0; // Variable donde se van sumando las ventas

		for (int i = 1; i <= cantidadVentas; i++) {
			System.out.println("Introduce el valor del producto " + i);
			int valorVenta = sc.nextInt();
			sumaVentas += valorVenta; // Podria valer sumaVentas = sumaVentas + valorVentaInt;
		}
		System.out.println("El total de la suma de ventas es: " + sumaVentas + "€");
	}

}