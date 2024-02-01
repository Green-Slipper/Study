package com.study.someprogect.models;

import com.study.someprogect.entity.Card;
import com.study.someprogect.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Data
public class HistoryModel {

    private Card card; // id карочек которые быть просмотренны

    private boolean checkMemory; // ответ Да(помню - true) и Нет(не помню - false)

    private User user; // id пользователя просматривавшего карточки

    private LocalDate date;
}
