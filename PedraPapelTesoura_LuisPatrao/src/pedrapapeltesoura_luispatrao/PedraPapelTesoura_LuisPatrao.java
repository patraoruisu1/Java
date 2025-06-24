package pedrapapeltesoura_luispatrao;

import java.util.Random;
import javax.swing.JOptionPane;

public class PedraPapelTesoura_LuisPatrao {

    public static void main(String[] args) {
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String[] opcoesJogarNovamente = {"Sim", "Não"};
        Random R = new Random();
        
        // Irá pedir o  nome do jogador:
        String nome = JOptionPane.showInputDialog(null,
                "Qual é o teu nome?",
                "Pedra, Papel e Tesoura",
                JOptionPane.QUESTION_MESSAGE);
        int pontuacaoUser = 0;
        int pontuacaoPC = 0;
        int resposta = 0;

        do {
            // O que eu quero escolher...
            int escolhaUsuario = JOptionPane.showOptionDialog(null,
                    "Selecione sua jogada, " + nome + ":",
                    "Pedra, Papel e Tesoura",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
            // O que o computador que escolher...
            int escolhaPC = R.nextInt(3);
            
            // O vencedor é...
            String resultado;
            if (escolhaUsuario == escolhaPC) {
                resultado = "Empate!";
            } else if ((escolhaUsuario == 0 && escolhaPC == 2) ||
                      (escolhaUsuario == 1 && escolhaPC == 0) ||
                      (escolhaUsuario == 2 && escolhaPC == 1)) {
                resultado = nome + " venceu!";
                pontuacaoUser++;
            } else {
                resultado = "Computador venceu!";
                pontuacaoPC++;
            }
            
            // Resultado:
            JOptionPane.showMessageDialog(null,
                    "Computador escolheu: " + opcoes[escolhaPC] + "\n" +
                    nome + " escolheu: " + opcoes[escolhaUsuario] + "\n\n" +
                    resultado + "\n\n" +
                    "Placar:\n" +
                    "PC: " + pontuacaoPC + " VS " + nome + ": " + pontuacaoUser,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            // Jogo novo:
            resposta = JOptionPane.showOptionDialog(null,
                    "Deseja jogar novamente?",
                    "Pedra, Papel e Tesoura",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesJogarNovamente,
                    opcoesJogarNovamente[0]);   
        } while (resposta != 1);
        // Final
        JOptionPane.showMessageDialog(null,
                "Jogo encerrado!\n\n" +
                "Placar Final:\n" +
                "PC: " + pontuacaoPC + " VS " + nome + ": " + pontuacaoUser,
                "Fim de Jogo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}