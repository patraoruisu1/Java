package pkg0816_p2;

import javax.swing.JOptionPane;

public class Quadrado {
    
    public static void main(String[] args) {
        Dimensao Quadrado=new Dimensao();
        
        Quadrado.setTipo("Quadrado");
        Quadrado.setv1(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor do lado do quadrado em metros")));
        Quadrado.setv2(Quadrado.getv1());
        JOptionPane.showMessageDialog(null,
                "A área do quadrado é:"+Quadrado.Area(),
                "Área do quadrado",
                JOptionPane.INFORMATION_MESSAGE);
    
    }
}
