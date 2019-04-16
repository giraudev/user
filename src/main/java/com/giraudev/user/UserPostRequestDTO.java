package com.giraudev.user;

public class UserPostRequestDTO {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;

    public UserPostRequestDTO(String nome, String cpf, String dataNascimento, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
