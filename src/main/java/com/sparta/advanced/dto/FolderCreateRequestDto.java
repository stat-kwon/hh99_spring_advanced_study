package com.sparta.advanced.dto;

import lombok.Getter;
import java.util.List;

@Getter
public class FolderCreateRequestDto {
    List<String> folderNames;
}