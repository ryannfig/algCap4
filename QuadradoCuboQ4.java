package quadradocubo;
import javax.swing.JOptionPane;
public class QuadradoCubo {

    public static void main(String[] args) {
      
 
        // Solicita um valor usando JOptionPane
        String valorString = JOptionPane.showInputDialog("Digite um valor:");
        int valor = Integer.parseInt(valorString);

        // Calcula o quadrado se o valor for par, ou o cubo se for ímpar
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

    
