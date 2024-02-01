package com.study.someprogect.models;

import com.study.someprogect.entity.Theme;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CardModel {

    private String question; // то ответ на что и ли определение чего надо вспомнить

    private String answer; // определение или ответ

    private Theme theme;
}
