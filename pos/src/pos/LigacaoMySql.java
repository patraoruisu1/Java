package pos;
import java.sql.*;
import javax.swing.JOptionPane;

public class LigacaoMySql {
   public String Estado="Não Ligado";
   
   public Connection CriarLigacaoMySql(){
       Connection Cn=null;
       try{
           String Driver="com.mysql.cj.jdbc.Driver";
           Class.forName(Driver);
           String Url="jdbc:mysql://127.0.0.1:3306/bdpos?useTimezone=true&serverTimezone=UTC";
           String User="root";
           String Password="12345678";
           Cn=DriverManager.getConnection(Url,User,Password);
           if(Cn!=null){
               Estado="Ligação efetuada com sucesso.";
           }
           return Cn;
       }
       catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "Driver não encontrado.",
                   "ERRO",JOptionPane.ERROR_MESSAGE);
           return null;
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null, 
                   "Não foi possível ligar à base de dados.",
                   "ERRO",JOptionPane.ERROR_MESSAGE);
           return null;          
       }
   }
   public String EstadoLigacao(){
       return(Estado);
   }
}
