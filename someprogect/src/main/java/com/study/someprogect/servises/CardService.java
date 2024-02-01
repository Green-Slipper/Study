package com.study.someprogect.servises;

import com.study.someprogect.DTO.CardDTO;
import com.study.someprogect.entity.Card;
import com.study.someprogect.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    public Long createCard(CardDTO dto) {
        Card card = new Card();
        card.setId(dto.getId());
        card.setQuestion(dto.getQuestion());
        card.setAnswer(dto.getAnswer());
        card.setTheme(dto.getTheme());

        cardRepository.save(card);
        return card.getId();
    }

    public String getAnswer(String id) {
        return cardRepository.findById(Long.valueOf(id)).get().getAnswer();
    }

    public String getQuestion(String id) {
        return cardRepository.findById(Long.valueOf(id)).get().getQuestion();
    }

    public Optional<Card> getCard(String id) {
        return cardRepository.findById(Long.valueOf(id));
    }


    public String editAnswer(String id, CardDTO dto) {
        Card card = cardRepository.findById(Long.valueOf(id)).get();
        card.setAnswer(dto.getAnswer());
        cardRepository.save(card);

        return card.getAnswer();
    }

    public String editQuestion(String id, CardDTO dto) {
        Card card = cardRepository.findById(Long.valueOf(id)).get();
        card.setQuestion(dto.getQuestion());
        cardRepository.save(card);

        return card.getQuestion();
    }

    public void deleteCard(String id) {
        cardRepository.deleteById(Long.valueOf(id));
    }


}
