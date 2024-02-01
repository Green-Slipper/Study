package com.study.someprogect.DTO;

import com.study.someprogect.entity.User;
import lombok.Data;

@Data
public class ThemeDTO {

    private Long id;

    private String name;

    private User author;
}
