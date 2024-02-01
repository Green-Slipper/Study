package com.study.someprogect.repository;

import com.study.someprogect.entity.Theme;
import com.study.someprogect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {

    List<Theme> findAll();

    List<Theme> findByAuthor(User author);

    Optional<Theme> findById(Long id);
}
