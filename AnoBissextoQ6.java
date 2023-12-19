package anobissexto;
import javax.swing.JOptionPane;
public class AnoBissexto {

    public static void main(String[] args) {
  
        String anoString = JOptionPane.showInputDialog("Digite um ano:");
        int ano = Integer.parseInt(anoString);

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        String mensagem = "O ano " + ano + (bissexto ? " é" : " não é") + " bissexto.";

        JOptionPane.showMessageDialog(null, mensagem, "Verificação de Ano Bissexto"
                                      ,JOptionPane.INFORMATION_MESSAGE);
            
    }
}

       
