package com.study.someprogect.repository;

import com.study.someprogect.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

    List<History> findAll();

    List<History> findByDate(LocalDate date);

}
