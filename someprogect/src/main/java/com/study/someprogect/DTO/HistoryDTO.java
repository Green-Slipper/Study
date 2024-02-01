package com.study.someprogect.DTO;

import com.study.someprogect.entity.Card;
import com.study.someprogect.entity.User;
import lombok.Data;
import java.time.LocalDate;

@Data
public class HistoryDTO {

    private Long id;

    private Card card;

    private boolean checkMemory;

    private User user;

    private LocalDate date;
}
