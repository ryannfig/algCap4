package ingressobelasartes;
import javax.swing.JOptionPane;
public class IngressoBelasArtes {

    public static void main(String[] args) {
      
        String precoBaseString = JOptionPane.showInputDialog("Digite o preço base do ingresso em reais:");
        double precoBase = Double.parseDouble(precoBaseString);

        String diaDaSemanaString = JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):");
        int diaDaSemana = Integer.parseInt(diaDaSemanaString);

        String idadeString = JOptionPane.showInputDialog("Digite a idade do espectador:");
        int idade = Integer.parseInt(idadeString);

        double desconto = 0.0;
        if (diaDaSemana == 2 || idade < 14) { // Terça-feira ou menor de 14 anos
            desconto = 0.5; // Desconto de 50%
        }

        double valorAPagar = precoBase - (precoBase * desconto);

        JOptionPane.showMessageDialog(null,"O valor a pagar é: R$"+valorAPagar);
   
    }
}
