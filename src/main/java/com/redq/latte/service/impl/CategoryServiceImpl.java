package com.redq.latte.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redq.latte.common.BaseService;
import com.redq.latte.dal.TermMapper;
import com.redq.latte.model.common.Term;
import com.redq.latte.service.CategoryService;

@Service
public class CategoryServiceImpl extends BaseService implements CategoryService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TermMapper termMapper;
    
    @Override
    public List<Term> listTerms() {
        logger.info("start list terms");
        return termMapper.selectAll(null);
    }

}
