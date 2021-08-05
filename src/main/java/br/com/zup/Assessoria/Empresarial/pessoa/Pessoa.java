package br.com.zup.Assessoria.Empresarial.pessoa;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Pessoa {

    @NotBlank
    private String nome;

    @NotBlank
    private String endereco;

    @Email
    private String email;

    @NotBlank
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
