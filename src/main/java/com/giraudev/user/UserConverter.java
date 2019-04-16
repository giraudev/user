package com.giraudev.user;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter {

    public User fromDTO(UserPostRequestDTO dto){
        return new User(dto.getNome(), dto.getCpf(), dto.getDataNascimento(), dto.getEndereco(),
                dto.getTelefone(), dto.getEmail());
    }

    public List<User> fromListDTO(List<UserPostRequestDTO> dto){
       return dto.stream().map(x -> new User(x.getNome(), x.getCpf(), x.getDataNascimento(), x.getEndereco(),
                x.getTelefone(), x.getEmail())).collect(Collectors.toList());
    }

    public List<UserGetResponseDTO> toListDTO(List<User> dto){
        return dto.stream().map(x -> new UserGetResponseDTO(x.getId(), x.getName(), x.getCpf(), x.getBirthDate(), x.getAddress(),
                x.getPhones(), x.getEmail())).collect(Collectors.toList());
    }

    public UserGetResponseDTO toGetDTO(User dto){
        return new UserGetResponseDTO(dto.getId(), dto.getName(), dto.getCpf(), dto.getBirthDate(), dto.getAddress(),
                dto.getPhones(), dto.getEmail());
    }
}
