package com.redq.latte.service;

import java.util.List;

import com.redq.latte.model.Term;
import com.redq.latte.model.TermTaxonomy;

public interface CategoryService {
    
    List<Term> getAllTerms();
    
    List<TermTaxonomy> getRootNodes(String taxonomyId);

}
    
