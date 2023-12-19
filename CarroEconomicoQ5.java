package carroeconomico;
import javax.swing.JOptionPane;
public class CarroEconomico {

    public static void main(String[] args) {
      
        String distanciaString = JOptionPane.showInputDialog("Digite a distância percorrida em quilômetros:");
        double distancia = Double.parseDouble(distanciaString);

        double combustivelGasto = distancia / 15.0;

        double kmPorLitro = distancia / combustivelGasto;

        String mensagem;
        if (kmPorLitro >= 15) {
            mensagem = "O carro é econômico.";
        } else {
            mensagem = "O carro não é econômico.";
        }

        JOptionPane.showMessageDialog(null, "Quantidade de combustível gasto: "+combustivelGasto+"."
                + "Quilômetros por litro: "+kmPorLitro+". Resultado: "+mensagem);
    }
}
