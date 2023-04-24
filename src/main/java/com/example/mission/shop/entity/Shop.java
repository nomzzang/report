package com.example.mission.shop.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Shop {
// 엔티티 설정
    @Id
    private String shopId;
    private String shopPassword;

    private String shopName;
    private String shopLocation;
    private String shopBriefly;
    private String shopContact;

    private LocalDateTime regDt;



}
