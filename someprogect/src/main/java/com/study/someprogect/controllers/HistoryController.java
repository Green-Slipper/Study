package com.study.someprogect.controllers;

import com.study.someprogect.servises.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/history/")
public class HistoryController {

    private final CardService service;

    //private final HistoryRepository themeRepository;

    // Что вообще должно быть в контроллере?

    // А нужен ли он?
}
