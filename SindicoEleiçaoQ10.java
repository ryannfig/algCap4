package sindicovoto;
import javax.swing.JOptionPane;
public class SindicoVoto {

    public static void main(String[] args) {
      
        String nomeCandidato1 = JOptionPane.showInputDialog("Digite o nome do candidato 1:");
        String votosCandidato1String = JOptionPane.showInputDialog("Digite o total de votos do candidato 1:");
        int votosCandidato1 = Integer.parseInt(votosCandidato1String);

        String nomeCandidato2 = JOptionPane.showInputDialog("Digite o nome do candidato 2:");
        String votosCandidato2String = JOptionPane.showInputDialog("Digite o total de votos do candidato 2:");
        int votosCandidato2 = Integer.parseInt(votosCandidato2String);

        String nomeCandidato3 = JOptionPane.showInputDialog("Digite o nome do candidato 3:");
        String votosCandidato3String = JOptionPane.showInputDialog("Digite o total de votos do candidato 3:");
        int votosCandidato3 = Integer.parseInt(votosCandidato3String);

       
        String vencedor = verificarVencedor(nomeCandidato1, votosCandidato1, nomeCandidato2, votosCandidato2, nomeCandidato3, votosCandidato3);

      
        JOptionPane.showMessageDialog(null, "O vencedor da eleição para síndico é: " + vencedor);
   
    }

    
    private static String verificarVencedor(String nomeCandidato1, int votosCandidato1, String nomeCandidato2, int votosCandidato2, String nomeCandidato3, int votosCandidato3) {
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            return nomeCandidato1;
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            return nomeCandidato2;
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            return nomeCandidato3;
        } else {
            return "Houve um empate ou votação inválida.";
        }
    }
}

    
