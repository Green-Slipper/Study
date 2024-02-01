package com.study.someprogect.controllers;

import com.study.someprogect.DTO.CardDTO;
import com.study.someprogect.entity.Card;
import com.study.someprogect.servises.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
public class CardController {

    private final CardService service;

    // Что вообще должно быть в контроллере?

    // 1. Нужно определить что будет делать приложение -
    //      1. Можно сказать что я Такой-то и проходить тест по карточкам.
    //          1. Просим авторизацию?
    //          2. Сам механизм теста
    //          3. Сохранение истории что в неё входит
    //      2. Можно сделать/сохранить/отредактировать/удалить карточку
    //      3. Можно создать тему и задать её, когда создаешь карточку

    @PostMapping(value = "/add")
    public String createCard(@RequestBody CardDTO newCard) {
        return service.getAnswer(service.createCard(newCard).toString());
    }

    @GetMapping(value = "/{id}/answer")
    public String getAnswer(@PathVariable("id") String id) throws Exception {
        if (service.getAnswer(id) == null) {
            throw new Exception("Нет ответа с таким номером");
        }
        return service.getAnswer(id);
    }

    @GetMapping(value = "/{id}/question")
    public String getQuestion(@PathVariable("id") String id) throws Exception {
        if (service.getQuestion(id) == null) {
            throw new Exception("Нет вопроса с таким номером");
        }
        return service.getQuestion(id);
    }

    @PostMapping(value = "/{id}/answer/edit")
    public String editAnswer(
            @PathVariable("id") String id,
            @RequestBody CardDTO newAnswer) throws Exception {
        if (service.getAnswer(id) == null) {
            throw new Exception("Нет ответа с таким номером");
        }
        service.editAnswer(id, newAnswer);
        return service.getAnswer(id);
    }

    @PostMapping(value = "/{id}/question/edit")
    public String editQuestion(
            @PathVariable("id") String id,
            @RequestBody CardDTO newQuestion) throws Exception {
        if (service.getQuestion(id) == null) {
            throw new Exception("Нет вопроса с таким номером");
        }
        service.editQuestion(id, newQuestion);
        return service.getQuestion(id);
    }

    @DeleteMapping(value = "{id}/delete/")
    public void deleteCard(@PathVariable("id") String id) throws Exception {
        if (service.getCard(id).isEmpty()) {
            throw new Exception("Нет карточки с таким номером");
        }
        service.deleteCard(id);
    }

}
