package com.sparta.advanced.dto;

import lombok.Getter;
import org.json.JSONObject;

 // 기본 생성자를 자동으로 만듭니다.
@Getter
public class ItemDto {
    private String title;
    private String link;
    private String image;
    private int lprice;

    public ItemDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.image = itemJson.getString("image");
        this.lprice = itemJson.getInt("lprice");
    }
}