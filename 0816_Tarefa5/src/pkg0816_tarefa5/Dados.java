package pkg0816_tarefa5;

import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class Dados {
    private ArrayList<Viaturas> viaturas;

    public Dados() {
        this.viaturas = new ArrayList<>();
    }

    public boolean adicionarViatura(Viaturas viatura) {
        for (Viaturas v : viaturas) {
            if (v.getMatricula().equals(viatura.getMatricula())) {
                return false;
            }
        }
        viaturas.add(viatura);
        return true;
    }

    public boolean removerViatura(String matricula) {
        return viaturas.removeIf(v -> v.getMatricula().equals(matricula));
    }

    public void mostrarTodasViaturas() {
        StringBuilder sb = new StringBuilder();
        for (Viaturas v : viaturas) {
            adicionarViaturaAoStringBuilder(sb, v);
        }
        float totalPreco = calcularPrecoTotal();
        sb.append("\nPreço Total: ").append(String.format("%.2f", totalPreco)).append("€");
        
        mostrarEmJanela("Todas as Viaturas", sb.toString());
    }

    public void mostrarViaturasPorMarca(String marca) {
        StringBuilder sb = new StringBuilder();
        for (Viaturas v : viaturas) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                adicionarViaturaAoStringBuilder(sb, v);
            }
        }
        
        if (sb.length() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma viatura encontrada com a marca: " + marca);
        } else {
            mostrarEmJanela("Viaturas da Marca " + marca, sb.toString());
        }
    }

    private void adicionarViaturaAoStringBuilder(StringBuilder sb, Viaturas v) {
        sb.append("Marca: ").append(v.getMarca()).append("\n");
        sb.append("Modelo: ").append(v.getModelo()).append("\n");
        sb.append("Matrícula: ").append(v.getMatricula()).append("\n");
        sb.append("Combustível: ").append(v.getCombustivel()).append("\n");
        sb.append("Kilometros: ").append(v.getKilometrosAtuais()).append("\n");
        sb.append("Preço: ").append(String.format("%.2f", v.getPreco())).append("€\n");
        sb.append("------------------------\n");
    }

    private float calcularPrecoTotal() {
        float total = 0;
        for (Viaturas v : viaturas) {
            total += v.getPreco();
        }
        return total;
    }

    private void mostrarEmJanela(String titulo, String conteudo) {
        JTextArea textArea = new JTextArea(conteudo);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));
        JOptionPane.showMessageDialog(null, scrollPane, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}