package com.study.someprogect.controllers;

import com.study.someprogect.DTO.ThemeDTO;
import com.study.someprogect.servises.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/theme")
public class ThemeController {

    private final ThemeService service;

    @GetMapping(value = "/{id}")
    public String getTheme(@PathVariable("id") String id) {
        return service.getTheme(id);
    }

    @PostMapping(value = "/{id}/edit")
    public List<String> editTheme(
            @PathVariable("id") String id,
            @RequestBody ThemeDTO newName) {
        service.editTheme(id, newName);
        return service.getCards(id);
    }

    @PatchMapping(value = "/{id}/cards/")
    public List<String> getCards(@PathVariable("id") String id) {
        return service.getCards(id);
    }

    @DeleteMapping(value = "/{id}/delete")
    public void deleteTheme(@PathVariable("id") String id) {
        service.deleteTheme(id);
    }

}
