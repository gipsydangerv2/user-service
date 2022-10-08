package com.ankit.userservice.userservice.service;

import com.ankit.userservice.userservice.PaymentServiceConfig;
import com.ankit.userservice.userservice.dto.PaymentInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class PaymentApiService implements IPaymentApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PaymentServiceConfig paymentServiceConfig;

    @Override
    public PaymentInfoDTO getPaymentInfoForUser(String userId) {
        String apiUrl = paymentServiceConfig.getBasePath() + paymentServiceConfig.getUserPaymentApi();
        PaymentInfoDTO paymentInfoDTO = null;
        try {
            paymentInfoDTO = restTemplate.getForObject(apiUrl, PaymentInfoDTO.class);
        } catch (Exception ex) {
            log.error("Exception occurred while calling Payment Service for user : {}. Message: {}",
                    userId, ex.getMessage());
        }
        return paymentInfoDTO;
    }

    @Override
    public List<PaymentInfoDTO> getAllPaymentInfo() {
        String apiUrl = paymentServiceConfig.getBasePath() + paymentServiceConfig.getAllUsersPaymentApi();
        List<PaymentInfoDTO> list = null;
        try {
            list = restTemplate.getForObject(apiUrl, List.class);
        } catch (Exception ex) {
            log.error("Exception occurred while calling Payment Service. Message: {}", ex.getMessage());
        }
        return list;
    }
}
