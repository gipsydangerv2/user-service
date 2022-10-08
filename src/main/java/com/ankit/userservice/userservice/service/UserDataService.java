package com.ankit.userservice.userservice.service;

import com.ankit.userservice.userservice.dto.PaymentInfoDTO;
import com.ankit.userservice.userservice.model.User;
import com.ankit.userservice.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataService implements IUserDataService {

    @Autowired
    private IPaymentApiService paymentApiService;

    public User getUserById(String userId) {
        User user = UserRepository.getUserById(userId);
        if (user == null) {
            return null;
        }
        PaymentInfoDTO paymentInfoDTO = paymentApiService.getPaymentInfoForUser(userId);
        user.setPaymentInfo(paymentInfoDTO);
        return user;
    }

    public List<User> getAllUsers() {
        List<User> response = UserRepository.getAllUsers();
        response.forEach(data -> {
            data.setPaymentInfo(paymentApiService.getPaymentInfoForUser(data.getUserId()));
        });
        return response;
    }
}
