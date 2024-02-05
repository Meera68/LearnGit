package com.example.LearnGit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Report {

    @Autowired
    ReportService reportService;

    @PostMapping("/getTrade")
    public TradeStatusResponse getReportByStatus(@RequestBody TradeStatusRequest tradeStatusRequest)
    {
        return reportService.getReportByStatus(tradeStatusRequest);
    }

}
