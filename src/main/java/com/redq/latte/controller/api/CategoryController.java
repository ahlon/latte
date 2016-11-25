package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.model.cat.Term;
import com.redq.latte.model.cat.TermTaxonomy;
import com.redq.latte.service.CategoryService;

import io.swagger.annotations.Api;

/**
 * 
 * @author tonghu
 * @version $Id: HomeController.java, v 0.1 2015年9月18日 下午7:16:41 tonghu Exp $
 */
@Api(value = "api")
@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/term/list")
    public RestDataResponse<List<Term>> listTerms() {
        return new RestDataResponse<List<Term>>(categoryService.getAllTerms());
    }
    
    @RequestMapping("/taxonomy/list")
    public RestDataResponse<List<Term>> listTaxonomies() {
        return new RestDataResponse<List<Term>>(categoryService.getAllTerms());
    }
    
    @RequestMapping("/term-taxonomy/roots")
    public RestDataResponse<List<TermTaxonomy>> listRootTermTaxonomies(Long taxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping("/term-taxonomy/parent")
    public RestDataResponse<List<TermTaxonomy>> getTermTaxonomyParent(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping("/term-taxonomy/children")
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyChildren(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping("/term-taxonomy/ancestors")
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyAncestors(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping("/term-taxonomy/descendants")
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyDescendants(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    
    
}
