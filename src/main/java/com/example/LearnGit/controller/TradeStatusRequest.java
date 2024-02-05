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
public class TradeStatusRequest {
    private List<String> tradestatus;
    private String isin;
    private String from;
    private List<String> sakList;
}
