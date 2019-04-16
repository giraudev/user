package com.giraudev.user.response;

public class UserGetResponseDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private Boolean active;

    public UserGetResponseDTO(Long id, String nome, String cpf, String dataNascimento, String endereco, String telefone, String email, Boolean active) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.active = active;
    }

    public Long getId() {
        return id;
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

    public Boolean getActive() {
        return active;
    }
}
