package com.example.mission.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class ShopParam {

    // 검색에서 받아올 데이터를 정의
    String searchType;
    String searchValue;
}
