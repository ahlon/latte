package com.redq.latte.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redq.latte.common.BaseService;
import com.redq.latte.mapper.TermMapper;
import com.redq.latte.mapper.TermTaxonomyMapper;
import com.redq.latte.model.cat.Term;
import com.redq.latte.model.cat.TermTaxonomy;
import com.redq.latte.service.CategoryService;

@Service
public class CategoryServiceImpl extends BaseService implements CategoryService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TermMapper termMapper;
    
    @Autowired
    private TermTaxonomyMapper termTaxonomyMapper;
    
    @Override
    public List<Term> getAllTerms() {
        logger.info("start list terms");
        return termMapper.selectAll(null);
    }

	@Override
	public List<TermTaxonomy> getRootTermTaxonomies(Long taxonomyId) {
		Map<String, Object> params = new HashMap<String, Object>();
		return termTaxonomyMapper.selectAll(params);
	}

	@Override
	public List<TermTaxonomy> getTermTaxonomyParent(Long taxonomyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TermTaxonomy> getTermTaxonomyChildren(Long taxonomyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TermTaxonomy> getTermTaxonomyAncestors(Long taxonomyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TermTaxonomy> getTermTaxonomyDescendants(Long taxonomyId) {
		// TODO Auto-generated method stub
		return null;
	}


}
