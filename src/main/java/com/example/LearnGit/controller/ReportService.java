package com.example.LearnGit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReportService {



    private RestTemplate restTemplate;


    public TradeStatusResponse getReportByStatus(TradeStatusRequest tradeStatusRequest)
        {
            return TradeStatusResponse.builder().build();
            }
}

