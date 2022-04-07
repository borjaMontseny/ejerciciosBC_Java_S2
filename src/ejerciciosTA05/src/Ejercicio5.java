import javax.swing.JOptionPane;

public class Ejercicio5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String numeroString = JOptionPane.showInputDialog("Introduce el número"); // Pedimos el valor y lo guardamos en un String
    double numeroTransformado = Double.parseDouble(numeroString); // Pasamos ese valor en String a Double
    if (numeroTransformado % 2 == 0) {
      JOptionPane.showMessageDialog(null, numeroTransformado + " es par.");
    } else {
      JOptionPane.showMessageDialog(null, numeroTransformado + " no es par.");
    }

  }

}