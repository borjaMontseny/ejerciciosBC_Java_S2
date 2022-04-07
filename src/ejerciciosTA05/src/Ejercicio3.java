import javax.swing.JOptionPane;

public class Ejercicio3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String nombreUsuario = JOptionPane.showInputDialog("Introduce tu usuario");
    JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreUsuario);
  }

}