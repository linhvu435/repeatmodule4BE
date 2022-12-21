package com.example.repeatmodule4.model.dto;


import com.example.repeatmodule4.model.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserToken {
    private String username;
    private Roles roles;
    private String token;
    private Long id;
}
