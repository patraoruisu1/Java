
package pkg0816_java_4;

import java.text.DecimalFormat;

public class Funcionarios {
    private String nome;
    private String contacto;
    private String email;

    public Funcionarios(String nome, String contacto, String email) {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Contacto: " + contacto);
        System.out.println("Email: " + email);
    }
}
