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
@Api(value = "category")
@RestController
@RequestMapping(value = "/api/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(value = "/term/list", method = RequestMethod.GET)
    public RestDataResponse<List<Term>> listTerms() {
        return new RestDataResponse<List<Term>>(categoryService.getAllTerms());
    }
    
    @RequestMapping(value = "/taxonomy/list", method = RequestMethod.GET)
    public RestDataResponse<List<Term>> listTaxonomies() {
        return new RestDataResponse<List<Term>>(categoryService.getAllTerms());
    }
    
    @RequestMapping(value = "/term-taxonomy/roots", method = RequestMethod.GET)
    public RestDataResponse<List<TermTaxonomy>> listRootTermTaxonomies(Long taxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(categoryService.getRootTermTaxonomies(taxonomyId));
    }
    
    @RequestMapping(value = "/term-taxonomy/parent", method = RequestMethod.GET)
    public RestDataResponse<List<TermTaxonomy>> getTermTaxonomyParent(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping(value = "/term-taxonomy/children", method = RequestMethod.GET)
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyChildren(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping(value = "/term-taxonomy/ancestors", method = RequestMethod.GET)
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyAncestors(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
    @RequestMapping(value = "/term-taxonomy/descendants", method = RequestMethod.GET)
    public RestDataResponse<List<TermTaxonomy>> listTermTaxonomyDescendants(Long termTaxonomyId) {
        return new RestDataResponse<List<TermTaxonomy>>(null);
    }
    
}
