package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  PartnerStatus {

    REGISTERED(0,"등록","파트너 등록상태"),
    UNREGISTERED(1,"해지","파트너 해지상태");

    private Integer id;
    private String title;
    private String description;
}
