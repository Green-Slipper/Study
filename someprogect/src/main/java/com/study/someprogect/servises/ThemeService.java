package com.study.someprogect.servises;

import com.study.someprogect.DTO.ThemeDTO;
import com.study.someprogect.entity.Theme;
import com.study.someprogect.repository.CardRepository;
import com.study.someprogect.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeService {

    private final ThemeRepository themeRepository;
    private final CardRepository cardRepository;

    public Theme createTheme(ThemeDTO dto) {
        Theme theme = new Theme();
        theme.setName(dto.getName());
        theme.setAuthor(dto.getAuthor());

        themeRepository.save(theme);
        return theme;
    }

    public String getTheme(String id) {
        return themeRepository.findById(Long.valueOf(id)).get().getName();
    }

    public String editTheme(String id, ThemeDTO dto) {
        Theme theme = new Theme();
        theme.setName(dto.getName());

       themeRepository.save(theme);
        return theme.getName();
    }

    public List<String> getCards(String id) {
        List<String> cards = Collections.singletonList(cardRepository.findByTheme(themeRepository.findById(Long.valueOf(id)).get()).toString());
        return cards;
    }

    public void deleteTheme(String id) {
        themeRepository.deleteById(Long.valueOf(id));
    }

}
