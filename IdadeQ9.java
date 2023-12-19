package idade;
     import javax.swing.JOptionPane;
public class Idade {

 
    public static void main(String[] args) {
  
        String idadeString = JOptionPane.showInputDialog("Digite a sua idade:");
        int idade = Integer.parseInt(idadeString);

       
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
                 
        } else {
            int anosParaMaiorIdade = 18 - idade;
            JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam "+anosParaMaiorIdade+" anos para ser maior.");
            
        }
    }
}

