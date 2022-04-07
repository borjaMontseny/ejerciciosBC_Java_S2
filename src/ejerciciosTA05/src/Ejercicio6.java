import java.util.Scanner; // Sin esto no podemos usar el Scanner
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
        Scanner sc = new Scanner(System.in); //Inicio el objeto Scanner
        System.out.println("Introduce el precio bruto del producto"); 
        String precioProductoString = sc.nextLine(); // Aquí recojo la información en un String
        double precioProductoDouble = Double.parseDouble(precioProductoString);
        System.out.println("El precio final del producto es " + (precioProductoDouble + (precioProductoDouble * IVA)) + "€");
	}

}