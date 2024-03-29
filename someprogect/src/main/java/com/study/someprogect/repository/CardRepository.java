package com.study.someprogect.repository;

import com.study.someprogect.entity.Card;
import com.study.someprogect.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findAll();

    List<Card> findByTheme(Theme theme);

    Optional<Card> findById(Long id);

    List<Card> findByQuestion(String question);
}
