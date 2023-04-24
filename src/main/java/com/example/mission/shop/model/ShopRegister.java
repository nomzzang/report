package com.example.mission.shop.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class ShopRegister {


    // 상점 등록할때 필요한 데이터
    private String shopId;
    private String shopPassword;

    private String shopName;
    private String shopLocation;
    private String shopBriefly;
    private String shopContact;
}
