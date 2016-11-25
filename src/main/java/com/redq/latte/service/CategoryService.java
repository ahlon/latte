package com.redq.latte.service;

import java.util.List;

import com.redq.latte.model.cat.Term;
import com.redq.latte.model.cat.TermTaxonomy;

public interface CategoryService {
    
    List<Term> getAllTerms();
    
    List<TermTaxonomy> getRootTermTaxonomies(String taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyParent(String taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyChildren(String taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyAncestors(String taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyDescendants(String taxonomyId);

}
    
