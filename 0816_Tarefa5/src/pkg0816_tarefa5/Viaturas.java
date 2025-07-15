package pkg0816_tarefa5;

public class Viaturas {
    private String marca;
    private String modelo;
    private String matricula;
    private String combustivel;
    private int kilometrosAtuais;
    private float preco;

    public Viaturas(String marca, String modelo, String matricula, 
                    String combustivel, int kilometrosAtuais, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.combustivel = combustivel;
        this.kilometrosAtuais = kilometrosAtuais;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getKilometrosAtuais() {
        return kilometrosAtuais;
    }

    public float getPreco() {
        return preco;
    }

    
    
    
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setKilometrosAtuais(int kilometrosAtuais) {
        this.kilometrosAtuais = kilometrosAtuais;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}