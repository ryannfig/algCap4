package massacorporal;
import javax.swing.JOptionPane;
public class MassaCorporal {

    public static void main(String[] args) {
       
        
        String pesoString = JOptionPane.showInputDialog("Digite o peso da pessoa em quilos:");
        double peso = Double.parseDouble(pesoString);

        String alturaString = JOptionPane.showInputDialog("Digite a altura da pessoa em metros:");
        double altura = Double.parseDouble(alturaString);

        double massaCorporal = peso / (altura * altura);

        String classificacao;
        if (massaCorporal < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (massaCorporal < 25) {
            classificacao = "Peso normal";
        } else if (massaCorporal < 30) {
            classificacao = "Sobrepeso";
        } else if (massaCorporal < 35) {
            classificacao = "Obeso leve";
        } else if (massaCorporal < 40) {
            classificacao = "Obeso moderado";
        } else {
            classificacao = "Obeso mórbido";
        }

        // Exibe a classificação usando JOptionPane
        JOptionPane.showMessageDialog(null,"A massa corporal da pessoa é "+massaCorporal+" e está classificada como: " +classificacao);
  
    }
}

    
