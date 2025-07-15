package pkg0816_tarefa5;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TestarViaturas {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Dados dados = new Dados();

        while (true) {
            String[] options = {
                "Adicionar Viatura",
                "Remover Viatura",
                "Mostrar Todas Viaturas",
                "Mostrar por Marca",
                "Sair"
            };

            int choice = JOptionPane.showOptionDialog(
                null,
                "Selecione uma opção:",
                "Gestão de Viaturas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );

            try {
                switch (choice) {
                    case 0:
                        String marca = JOptionPane.showInputDialog("Marca:");
                        if (marca == null) continue;
                        
                        String modelo = JOptionPane.showInputDialog("Modelo:");
                        if (modelo == null) continue;
                        
                        String matricula = JOptionPane.showInputDialog("Matrícula:");
                        if (matricula == null) continue;
                        
                        String combustivel = JOptionPane.showInputDialog("Combustível:");
                        if (combustivel == null) continue;
                        
                        String kmStr = JOptionPane.showInputDialog("Kilometros:");
                        if (kmStr == null) continue;
                        int km = Integer.parseInt(kmStr);
                        
                        String precoStr = JOptionPane.showInputDialog("Preço:");
                        if (precoStr == null) continue;
                        float preco = Float.parseFloat(precoStr);

                        Viaturas novaViatura = new Viaturas(marca, modelo, matricula, combustivel, km, preco);
                        if (dados.adicionarViatura(novaViatura)) {
                            JOptionPane.showMessageDialog(null, "Viatura adicionada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Matrícula já existe!");
                        }
                        break;

                    case 1:
                        String matriculaRemover = JOptionPane.showInputDialog("Matrícula da viatura a remover:");
                        if (matriculaRemover != null) {
                            if (dados.removerViatura(matriculaRemover)) {
                                JOptionPane.showMessageDialog(null, "Viatura removida com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Viatura não encontrada!");
                            }
                        }
                        break;

                    case 2:
                        dados.mostrarTodasViaturas();
                        break;

                    case 3:
                        String marcaBusca = JOptionPane.showInputDialog("Marca a pesquisar:");
                        if (marcaBusca != null) {
                            dados.mostrarViaturasPorMarca(marcaBusca);
                        }
                        break;

                    case 4:
                    case -1:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}
