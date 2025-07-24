package pos;

import javax.swing.JOptionPane;


public class TestarLigacao {

 
    public static void main(String[] args) {
       LigacaoMySql bd=new LigacaoMySql();
       bd.CriarLigacaoMySql();
       JOptionPane.showMessageDialog(null, bd.EstadoLigacao(), 
               "Ligação MySql", JOptionPane.INFORMATION_MESSAGE);
    }

}
