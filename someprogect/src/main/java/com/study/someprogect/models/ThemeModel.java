package com.study.someprogect.models;

import com.study.someprogect.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ThemeModel {

    private String name; // название темы

    private User author;
}
