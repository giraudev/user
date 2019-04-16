package com.giraudev.user.request;

import java.util.List;


public class UserListPostRequestDTO {

    private List<UserPostRequestDTO> userPostRequestDTOS;

    public UserListPostRequestDTO(List<UserPostRequestDTO> userPostRequestDTOS) {
        this.userPostRequestDTOS = userPostRequestDTOS;
    }

    public List<UserPostRequestDTO> getUserPostRequestDTOS() {
        return userPostRequestDTOS;
    }
}
