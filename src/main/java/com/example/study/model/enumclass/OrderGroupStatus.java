package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  OrderGroupStatus {

    COMPLETE(0,"완성","주문상태 완성"),
    INCOMPLETE(1,"미완성","주문상태 미완성");

    private Integer id;
    private String title;
    private String description;
}
