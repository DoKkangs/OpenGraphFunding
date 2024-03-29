package com.example.testfunding.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Funding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemLink;
    private String itemImage;
    private String itemName;
    private String title;
    private String content;
    private Integer goalAmount;
    private boolean publicFlag;
    private LocalDate endDate;

    public Funding(String itemLink, String itemImage, String itemName, String title, String content, Integer goalAmount, boolean publicFlag, LocalDate endDate) {
        this.itemLink = itemLink;
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.title = title;
        this.content = content;
        this.goalAmount = goalAmount;
        this.publicFlag = publicFlag;
        this.endDate = endDate;
    }
}
