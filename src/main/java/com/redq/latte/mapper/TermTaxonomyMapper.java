package com.redq.latte.mapper;

import java.util.List;
import java.util.Map;

import com.redq.latte.common.CrudMapper;
import com.redq.latte.model.cat.TermTaxonomy;

public interface TermTaxonomyMapper extends CrudMapper<TermTaxonomy> {
	
    List<TermTaxonomy> selectAll(Map<String, Object> params);
    
    List<TermTaxonomy> selectRoots(Long taxonomyId);
    
    List<TermTaxonomy> selectChildren(Long taxonomyId);
    
}