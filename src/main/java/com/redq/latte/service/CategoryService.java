package com.redq.latte.service;

import java.util.List;

import com.redq.latte.model.cat.Term;
import com.redq.latte.model.cat.TermTaxonomy;

public interface CategoryService {
    
    List<Term> getAllTerms();
    
    List<TermTaxonomy> getRootTermTaxonomies(Long taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyParent(Long taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyChildren(Long taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyAncestors(Long taxonomyId);
    
    List<TermTaxonomy> getTermTaxonomyDescendants(Long taxonomyId);

}
    
