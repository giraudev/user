package com.giraudev.user.resource;

import com.giraudev.user.request.UserPatchRequestDTO;
import com.giraudev.user.service.UserService;
import com.giraudev.user.domain.User;
import com.giraudev.user.request.UserPostRequestDTO;
import com.giraudev.user.response.UserGetResponseDTO;
import com.giraudev.user.response.UserPostResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserGetResponseDTO>> getAll() {
        return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
    }

    @GetMapping(path = "/{userId}")
    public ResponseEntity<UserGetResponseDTO> get(@PathVariable Long userId) {
        return new ResponseEntity<>(userService.get(userId),HttpStatus.OK);
    }

    @PostMapping(path = "/user")
    public ResponseEntity<UserPostResponseDTO> post(@RequestBody UserPostRequestDTO requestDTO) {
        User user = userService.post(requestDTO);
        return new ResponseEntity<>(new UserPostResponseDTO(user.getId()),HttpStatus.CREATED);
    }

    @PostMapping(path = "/all")
    public ResponseEntity<Void> postAll(@RequestBody List<UserPostRequestDTO> requestDTO) {
        userService.postAll(requestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping(path = "/")
    public ResponseEntity<Void> patch(@RequestBody UserPatchRequestDTO requestDTO) {
        userService.patch(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping(path = "/user/{userId}")
    public ResponseEntity<Void> update(@PathVariable Long userId) {
        userService.update(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
