package com.ankit.userservice.userservice.service;

import com.ankit.userservice.userservice.dto.PaymentInfoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IPaymentApiService {
    @GetMapping("/paymentInfo/{userId}")
    public PaymentInfoDTO getPaymentInfoForUser(@PathVariable("userId") String userId);

    @GetMapping("/allPaymentInfo")
    public List<PaymentInfoDTO> getAllPaymentInfo();
}
