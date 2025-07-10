package pkg0816_java_4;

import java.text.DecimalFormat;

public class Financeiro extends Funcionarios {
    private double salarioFixo;
    private double premioProdutividade;

    public Financeiro(String nome, String contacto, String email, double salarioFixo, double premioProdutividade) {
        super(nome, contacto, email);
        this.salarioFixo = salarioFixo;
        this.premioProdutividade = premioProdutividade;
    }

    public double calcularSalario() {
        return salarioFixo + premioProdutividade;
    }

    public void imprimirSalario() {
        DecimalFormat df = new DecimalFormat("€#,##0.00");
        System.out.println("Salário total (financeiro): " + df.format(calcularSalario()));
    }
    
    
}

