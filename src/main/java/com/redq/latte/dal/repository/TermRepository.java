package com.redq.latte.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redq.latte.model.Term;

@Repository
public interface TermRepository extends CrudRepository<Term, Long> {

}
