package mediaescola;
 import javax.swing.JOptionPane;
public class MediaEscola {

    public static void main(String[] args) {
       
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");

        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            String notaString = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " do aluno:");
            notas[i] = Double.parseDouble(notaString);
        }

        double media = calcularMedia(notas);

        boolean aprovado = media >= 6.0 && media <= 10.0;

        String mensagem = nomeAluno + ", sua média é " + media + ". Você " + (aprovado ? "passou" : "não passou") + ".";

        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
