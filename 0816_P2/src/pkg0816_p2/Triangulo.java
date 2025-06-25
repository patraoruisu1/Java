package pkg0816_p2;

import javax.swing.JOptionPane;

public class Triangulo {
    
    public static void main(String[] args) {
        Dimensao Triangulo=new Dimensao();
        
        Triangulo.setTipo("Triangulo");
        Triangulo.setv1(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor da base em metros")));
        Triangulo.setv2(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor da altura em metros")));
        JOptionPane.showMessageDialog(null,
                "A área do triangulo é:"+Triangulo.Area(),
                "Área do triangulo",
                JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
