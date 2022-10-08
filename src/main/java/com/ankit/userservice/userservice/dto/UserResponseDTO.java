package com.ankit.userservice.userservice.dto;

import com.ankit.userservice.userservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private User user;
    private Boolean isActive;
}
