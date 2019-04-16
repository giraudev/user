package com.giraudev.user.service;

import com.giraudev.user.converter.UserConverter;
import com.giraudev.user.domain.User;
import com.giraudev.user.repository.UserRepository;
import com.giraudev.user.request.UserPostRequestDTO;
import com.giraudev.user.response.UserGetResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserConverter converter;

    @Autowired
    private UserRepository repository;

    public User post(UserPostRequestDTO requestDTO){
        User user = converter.fromDTO(requestDTO);
        repository.save(user);
        return user;
    }

    public void postAll(List<UserPostRequestDTO> requestDTO){
        List<User> users = converter.fromListDTO(requestDTO);
        repository.saveAll(users);
    }

    public void update(Long userId){
        Optional<User> user =repository.findById(userId);
        user.ifPresent(x -> x.setActive(false));
    }

    public List<UserGetResponseDTO> getAll(){
        List<User> users = repository.findAll();
        return converter.toListDTO(users);
    }

    public UserGetResponseDTO get(Long id){
        Optional<User> user = repository.findById(id);
        return converter.toGetDTO(user.get());
    }


}
