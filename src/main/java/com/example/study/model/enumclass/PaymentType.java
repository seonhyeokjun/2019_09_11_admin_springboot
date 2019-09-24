package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  PaymentType {

    CARD(0,"카드","카드결제"),
    CASH(1,"현금","현금결제");

    private Integer id;
    private String title;
    private String description;
}
