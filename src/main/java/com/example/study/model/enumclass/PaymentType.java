package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  PaymentType {

    BANK_TRANSFER(0,"계좌","은행계좌입금"),
    CARD(0,"신용카드","신용카드결제"),
    CHECK_CARD(1,"체크카드","체크카드결제");

    private Integer id;
    private String title;
    private String description;
}
