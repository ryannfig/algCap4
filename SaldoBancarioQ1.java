package saldobancario;
  import javax.swing.JOptionPane;
public class SaldoBancario {

    public static void main(String[] args) {
     
      
        String saldoInicialString = JOptionPane.showInputDialog("Digite o saldo inicial:");
        double saldoInicial = Double.parseDouble(saldoInicialString);

        String totalDebitosString = JOptionPane.showInputDialog("Digite o total de débitos:");
        double totalDebitos = Double.parseDouble(totalDebitosString);

     
        String totalCreditosString = JOptionPane.showInputDialog("Digite o total de créditos:");
        double totalCreditos = Double.parseDouble(totalCreditosString);

       
        double saldoFinal = saldoInicial - totalDebitos + totalCreditos;

      
        String mensagem;
        if (saldoFinal > 0) {
            mensagem = String.format("Saldo positivo em R$ %.2f", saldoFinal);
        } else if (saldoFinal < 0) {
            mensagem = String.format("Saldo negativo em R$ %.2f", saldoFinal);
        } else {
            mensagem = "Saldo zero";
        }

        JOptionPane.showMessageDialog(null, "Resultado:" +mensagem);
              
        
    }
}

    
