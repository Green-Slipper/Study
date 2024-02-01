package com.study.someprogect.DTO;

import com.study.someprogect.entity.Theme;
import lombok.Data;

@Data
public class CardDTO {

    private Long id;

    private String question;

    private String answer;

    private Theme theme;

}
