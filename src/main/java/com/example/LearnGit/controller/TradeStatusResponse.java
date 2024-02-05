package com.example.LearnGit.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeStatusResponse {

    private String transactionId;
    private String isin;
    private List<String> sakList;

}
