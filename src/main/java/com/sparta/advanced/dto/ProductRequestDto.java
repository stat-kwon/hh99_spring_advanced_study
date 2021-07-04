package com.sparta.advanced.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
// ㅇㅈㅇㅈ
@Getter
public class ProductRequestDto {
    // 관심상품명
    private String title;
    // 관심상품 썸네일 image URL
    private String image;
    // 관심상품 구매링크 URL
    private String link;
    // 관심상품의 최저가
    private int lprice;
}


// Dto는 값을 인자로 받아 생성하게 되서 기본생성자만 필요할거 같은데
// 1. 기본생성자 생략가능한데 @NoArgsConstructor ??
// 2. @AllArgsConstructor ??
// 3. 햇갈리는게 기본형 변수는 초기화가 안되서 해줘야한다 그거랑 연관있는지