package com.ankit.userservice.userservice.model;

import com.ankit.userservice.userservice.dto.PaymentInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String name;
    private String email;
    private String phoneNumber;
    private PaymentInfoDTO paymentInfo;

    public User (User user) {
        this.userId = user.userId;
        this.name = user.name;
        this.email = user.email;
        this.phoneNumber = user.phoneNumber;
        this.paymentInfo = user.paymentInfo;
    }
}
