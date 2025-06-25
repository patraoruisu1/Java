package pkg0816_p2;

import javax.swing.JOptionPane;

public class Retangulo {

    public static void main(String[] args) {
        Dimensao Retangulo=new Dimensao();
        
        
        Retangulo.setTipo("Rectangulo");
        Retangulo.setv1(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor do lado maior em metros")));
        Retangulo.setv2(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor do lado menor em metros")));
        JOptionPane.showMessageDialog(null,
                "A área do rectangulo é:"+Retangulo.Area(),
                "Área do rectangulo",
                JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
