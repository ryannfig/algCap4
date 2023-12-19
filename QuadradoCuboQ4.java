package quadradocubo;
import javax.swing.JOptionPane;
public class QuadradoCubo {

    public static void main(String[] args) {
      
 
        String valorString = JOptionPane.showInputDialog("Digite um valor:");
        int valor = Integer.parseInt(valorString);

        int resultado;
        if (valor % 2 == 0) {
            resultado = valor * valor; // Quadrado
            JOptionPane.showMessageDialog(null, "Para valores pares: "+resultado);
        } else {
            resultado = valor * valor * valor; // Cubo
            JOptionPane.showMessageDialog(null,"Para valores ímpares: "+resultado);
        }

    }
}

    
