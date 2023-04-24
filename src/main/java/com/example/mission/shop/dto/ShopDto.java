package com.example.mission.shop.dto;

import com.example.mission.shop.entity.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShopDto {
// 웹에 표출줄 자료를 따로 정리
    @Id
    private String shopName;
    private String shopLocation;
    private String shopBriefly;
    private String shopContact;



}
