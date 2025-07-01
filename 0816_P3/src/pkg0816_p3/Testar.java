package pkg0816_p3;
import javax.swing.JOptionPane;

public class Testar {

     public static void main(String[] args) {
         String[] Opcoes={"Rectângulo","Quadrado","Triângulo","Sair"};
         String Tipo;
         float V1, V2;
         int Escolha=0;
         do{
             
             Escolha=JOptionPane.showOptionDialog(null, 
                     "Selecione a sua opção", 
                     "Classe Dimensão", 
                     JOptionPane.YES_NO_OPTION, 
                     JOptionPane.PLAIN_MESSAGE, 
                     null, Opcoes, 
                     null);
             if(Escolha==3) break;
                Tipo=(Opcoes[Escolha]);
                V1=(Float.parseFloat(JOptionPane.showInputDialog(null,
                     "Digite o 1º valor(em cm) do "+Tipo)));
                V2=(Float.parseFloat(JOptionPane.showInputDialog(null,
                     "Digite o 2º valor(em cm) do "+Tipo))); 
                // Criar o objeto 
                FigurasGeometricas F=new FigurasGeometricas(V1,V2,Tipo);
                JOptionPane.showMessageDialog(null, 
                     "A àrea do "+Tipo+" é "+
                      F.Area(),"Classe Dimensão",
                      JOptionPane.INFORMATION_MESSAGE);
         }while(Escolha!=3);         
    }

}