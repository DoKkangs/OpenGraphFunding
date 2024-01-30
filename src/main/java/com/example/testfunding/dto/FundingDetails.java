package com.example.testfunding.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FundingDetails {
    private String publicName;
    private String title;
    private String content;
    private Integer goalAmount;
    private boolean publicFlag;
    private LocalDate endDate;

    // 생성자, Getter, Setter 등 필요한 메서드를 추가할 수 있습니다.

    public FundingDetails() {
        // 기본 생성자
    }
}