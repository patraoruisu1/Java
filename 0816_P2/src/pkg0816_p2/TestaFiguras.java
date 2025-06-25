package pkg0816_p2;

import javax.swing.JOptionPane;

public class TestaFiguras {
    
    public static void main(String[] args) {
        String[] Opcoes={"Rectangulo","Quadrado","Triangulo","Sair"};
        int Escolha=0;
        do {
            if(Escolha==3) break;
            Escolha=JOptionPane.showOptionDialog(null,
                    "Selecione a sua opção",
                    "Classe Dimensão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null, Opcoes,
                    null);
                    
                if(Escolha==3) break;  
                Dimensao F=new Dimensao();
                F.setTipo(Opcoes[Escolha]);
                F.setv1(Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Digite o 1º valor(em cm) do "+F.getTipo())));
                F.setv1(Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Digite o 2º valor(em cm) do "+F.getTipo())));
                JOptionPane.showMessageDialog(null,
                        "A área do "+F.getTipo()+" é "+
                        F.Area(), "Classe Dimensão",
                        JOptionPane.INFORMATION_MESSAGE);    
            }while(Escolha!=3);  
    }
}
