package com.redq.latte.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redq.latte.model.common.Term;

@Repository
public interface TermRepository extends CrudRepository<Term, Long> {

}
