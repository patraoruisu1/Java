package pkg0816_java_4;

import java.text.DecimalFormat;

public class Administrativo extends Funcionarios{
    private double salarioFixo;
    private int horasExtras;
    private static final double VALOR_HORA_EXTRA = 3.0;
    
    public Administrativo(String nome, String contacto, String email, double salarioFixo, int horasExtras) {
        super(nome, contacto, email);
        this.salarioFixo = salarioFixo;
        this.horasExtras = horasExtras;
    }
    
    public double calcularSalario() {
        return salarioFixo + (horasExtras * VALOR_HORA_EXTRA);
    }
    
    public void imprimirSalario() {
        DecimalFormat df = new DecimalFormat("€#,##0.00");
        System.out.println("Salário total (administrativo): " + df.format(calcularSalario()));
    }
    
}
