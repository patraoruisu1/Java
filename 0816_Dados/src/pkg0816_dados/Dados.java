package pkg0816_dados;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Dados {
    ArrayList<MovimentosConta> ArrayConta=new ArrayList();
    
    // criar um método para inserir o movimento
   public void AdicionarMovimento(MovimentosConta C){
       this.ArrayConta.add(C);
   }
   // método para listar os movimentos
   public String ListarMovimentos(){
       DecimalFormat F=new DecimalFormat("0.00 Eur");
       String Lista="";
       for(int i=0;i<ArrayConta.size();i++){
           MovimentosConta C=ArrayConta.get(i);
           Lista+="\nNº Mov:"+C.getNumeroMovimento()+
                  " | Data:"+C.getDataMovimento()+
                  " | Tipo:"+C.getTipoMovimento()+
                  " | Valor:"+F.format(C.getValorMovimento());
       }
       return(Lista);
   }
   // criar o método para apresentar o saldo da conta
   public void Saldo(){
       DecimalFormat F=new DecimalFormat("0.00 Eur");
       float Levantamento=0, Deposito=0;
       for(int i=0;i<ArrayConta.size();i++){
           MovimentosConta C=ArrayConta.get(i);
           if(C.getTipoMovimento().equals("Levantamento")){
               Levantamento+=C.getValorMovimento();
           }
           else{
               Deposito+=C.getValorMovimento(); 
           }
       }
       JOptionPane.showMessageDialog(null, 
               "Depósitos:"+F.format(Deposito)+
               "\nLevantamentos:"+F.format(Levantamento)+
               "\nSaldo:"+F.format(Deposito-Levantamento), 
               "Saldo", JOptionPane.INFORMATION_MESSAGE);
   }
   // método para eliminar o movimento
   public void ApagarMovimento(int NumeroMovimento){
       Boolean Existe=false;
       for(int i=0;i<ArrayConta.size();i++){
           MovimentosConta C=ArrayConta.get(i);
           if(C.getNumeroMovimento()==NumeroMovimento){
               ArrayConta.remove(i);
               Existe=true;
               break;
           }
       }
       if(Existe){
           JOptionPane.showMessageDialog(null, 
                   "Registo eliminado com sucesso",
                   "Apagar Movimento",
                   JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           JOptionPane.showMessageDialog(null, 
                   "Nº de movimento inxistente",
                   "Apagar Movimento",
                   JOptionPane.ERROR_MESSAGE);           
       }
   }
   public void ActualizaId(){
       int id=1;
       for(int i=0;i<ArrayConta.size();i++){
           MovimentosConta C=ArrayConta.get(i);
           C.setNumeroMovimento(id);
           id++;
       }
   }
}