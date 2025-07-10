package pkg0816_dados;

import javax.swing.JOptionPane;

public class TestarMovimentos {

     public static void main(String[] args) {
       String[] Opcoes={"Inserir", "Listagem","Eliminar","Saldo","Sair"};
       String[] Tipos={"Levantamento","Depósito"};
       Dados D=new Dados();
       int Escolha=0;
       do{
           Escolha=JOptionPane.showOptionDialog(null, 
                   "Selecione a sua opção", 
                   "Movimentos de Conta", 
                   JOptionPane.YES_OPTION, 
                   JOptionPane.PLAIN_MESSAGE, null, Opcoes, null);
           switch(Escolha){
               case 0->{
                   String Data=JOptionPane.showInputDialog(null,
                           "Digite a data do movimento (dd-mm-aaaa)");
                   String Tipo=(String)JOptionPane.showInputDialog(null,
                           "Digite o tipo do movimento",
                           "Movimentos de conta",
                           JOptionPane.INFORMATION_MESSAGE,
                           null,Tipos,null);
                   float Valor=Float.parseFloat(JOptionPane.showInputDialog(null,
                           "Digite o valor do movimento"));
                   // criar um objeto da classe MovimentosConta
                   MovimentosConta M=new MovimentosConta(D.ArrayConta.size()+1,
                   Data,Tipo,Valor);
                   D.AdicionarMovimento(M);
                   JOptionPane.showMessageDialog(null, "Registo inserido",
                           "Movimentos de conta",JOptionPane.INFORMATION_MESSAGE);
               }
               case 1->{
                    JOptionPane.showMessageDialog(null, D.ListarMovimentos(),
                           "Listagem de Movimentos",JOptionPane.INFORMATION_MESSAGE);
               }
               case 2->{
                   int NumeroMovimento=Integer.parseInt(JOptionPane.showInputDialog(null, 
                           "Digite o número do movimento a eliminar"));
                   D.ApagarMovimento(NumeroMovimento);
                   D.ActualizaId();
               }
               case 3->{
                    D.Saldo();
               }    
           }
       }while(Escolha!=4);
       
    }

}