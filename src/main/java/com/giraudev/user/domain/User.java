package com.giraudev.user.domain;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONES")
    private String phones;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Deprecated
    User(){}

    public User(String name, String cpf, String birthDate, String address, String phones, String email) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.address = address;
        this.phones = phones;
        this.email = email;
        this.active = true;
    }

    public void setActive(Boolean active) {
        if(!this.active.equals(active)){
            this.active = active;}
    }

    public void update(String name, String cpf, String birthDate, String address, String phones, String email) {
        Optional.ofNullable(name).ifPresent(newName -> this.name = newName);
        Optional.ofNullable(cpf).ifPresent(newCpf -> this.cpf = newCpf);
        Optional.ofNullable(birthDate).ifPresent(newBirthDate -> this.birthDate = newBirthDate);
        Optional.ofNullable(address).ifPresent(newAddress -> this.address = newAddress);
        Optional.ofNullable(phones).ifPresent(newPhones -> this.phones = newPhones);
        Optional.ofNullable(email).ifPresent(newEmail -> this.email = newEmail);

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhones() {
        return phones;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return active;
    }
}