package planocartesiano;
 import javax.swing.JOptionPane;
public class PlanoCartesiano {

    public static void main(String[] args) {
       
        String xString = JOptionPane.showInputDialog("Digite a coordenada x do ponto:");
        double x = Double.parseDouble(xString);

        String yString = JOptionPane.showInputDialog("Digite a coordenada y do ponto:");
        double y = Double.parseDouble(yString);

        String mensagem = verificarPosicaoPonto(x, y);

        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    private static String verificarPosicaoPonto(double x, double y) {
      
        double valorParabola = x * x - 3 * x + 1;
        
        if (y > valorParabola) {
            return "O ponto está acima da parábola.";
        } else if (y < valorParabola) {
            return "O ponto está abaixo da parábola.";
        } else {
            return "O ponto pertence à parábola.";
        }
    }
}

    
