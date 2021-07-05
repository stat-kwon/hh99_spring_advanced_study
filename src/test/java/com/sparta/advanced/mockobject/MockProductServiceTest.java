package com.sparta.advanced.mockobject;

import com.sparta.advanced.mockobject.MockProductService;
import com.sparta.advanced.dto.ProductMypriceRequestDto;
import com.sparta.advanced.dto.ProductRequestDto;
import com.sparta.advanced.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockProductServiceTest {
    @Test
    @DisplayName("updateProduct() 에 의해 관심 가격이 3만원으로 변경되는지 확인")
    void updateProduct_Normal() {
        // given
        int myprice = 30000;

        ProductMypriceRequestDto requestMyPriceDto = new ProductMypriceRequestDto(
                myprice
        );

        Long userId = 12345L;
        ProductRequestDto  requestProductDto = new ProductRequestDto(
                "오리온 꼬북칩 초코츄러스맛 160g",
                "https://shopping-phinf.pstatic.net/main_2416122/24161228524.20200915151118.jpg",
                "https://search.shopping.naver.com/gate.nhn?id=24161228524",
                2350
        );

        MockProductService mockProductService = new MockProductService(); // 여기부분 가짜 객체 생성이 가장 중요한 포인트!!
        // 회원의 관심상품을 생성
        Product product = mockProductService.createProduct(requestProductDto, userId);

        // when
        Product result = mockProductService.updateProduct(product.getId(), requestMyPriceDto);

        // then
        assertEquals(myprice, result.getMyprice());
    }
}