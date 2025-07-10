package pkg0816_java_4;

import java.text.DecimalFormat;

public class Vendedor extends Funcionarios {
    private double salarioBase;
    private double valorVendas;
    private static final double COMISSAO = 0.05;
    
    public Vendedor (String nome, String contacto, String email, double salarioBase, double valorVendas) {
        super(nome, contacto, email);
        this.salarioBase = salarioBase;
        this.valorVendas = valorVendas;
    
    
    }
    
    public double calcularSalario () {
        return salarioBase + (valorVendas * COMISSAO);
    
    
    }
    
    
    public void imprimirSalario () {
        DecimalFormat df = new DecimalFormat("€#,##0.00");
        System.out.println("Salário total (vendedor): " + df.format(calcularSalario()));
    
    
    }
            
    
}
