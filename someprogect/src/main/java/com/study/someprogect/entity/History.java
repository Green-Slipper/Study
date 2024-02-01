package com.study.someprogect.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.time.LocalDate; // проверить из ТОЙ ли библиотеки дата и правильно ли её так хранить)))

/**
 * История опросов
 */

@Entity
@Getter
@Setter
@Table(name = "history_cards", schema = "public")
public class History {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private Card card; // id карочек которые быть просмотренны


    @Column(name = "check_memory")
    private boolean checkMemory; // ответ Да(помню - true) и Нет(не помню - false)


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // id пользователя просматривавшего карточки


    @Column(name = "date_check")
    private LocalDate date; // время когда просматривали

}
