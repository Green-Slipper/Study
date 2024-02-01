package com.study.someprogect.specification;

import com.study.someprogect.entity.History;
import com.study.someprogect.entity.User;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class HistorySpecification implements Specification<History> {

//    public static Specification<History> lastDateFalseCardOfUser(Long card) {
//        return (root, query, criteriaBuilder) ->
//            criteriaBuilder.equal(root.get(String.valueOf()).get(card), );
//    }

    @Override
    public Predicate toPredicate(Root<History> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }
}
