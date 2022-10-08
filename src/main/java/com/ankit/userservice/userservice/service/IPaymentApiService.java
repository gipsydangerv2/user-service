package com.ankit.userservice.userservice.service;

import com.ankit.userservice.userservice.dto.PaymentInfoDTO;

import java.util.List;

public interface IPaymentApiService {
    PaymentInfoDTO getPaymentInfoForUser(String userId);

    List<PaymentInfoDTO> getAllPaymentInfo();
}
