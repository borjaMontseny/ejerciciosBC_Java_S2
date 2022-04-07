import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String radioCirculoString = JOptionPane.showInputDialog("Introduce el radio del círculo");
	    
	    double radioTransformado = Double.parseDouble(radioCirculoString);
	    
		double formulaAreaCirculo = Math.PI * (Math.pow(radioTransformado, radioTransformado)); //Esta variable ya es la formula
		
	    JOptionPane.showMessageDialog(null, "El área de este círculo es " + formulaAreaCirculo);
	}

}
