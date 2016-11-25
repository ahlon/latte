package com.redq.latte.model.cat;

import com.redq.latte.model.BaseEntity;

/**
 * consider rename termtaxonomy to treenode
 * @author Ahlon
 *
 */
public class TermTaxonomy extends BaseEntity {
	private Long termId;
	private String termName;
	private Long parentId;
	private String path;
	private Long taxonomyId;
	private Long taxonomyName;
	
	public Long getTermId() {
		return termId;
	}
	public void setTermId(Long termId) {
		this.termId = termId;
	}
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Long getTaxonomyId() {
		return taxonomyId;
	}
	public void setTaxonomyId(Long taxonomyId) {
		this.taxonomyId = taxonomyId;
	}
	public Long getTaxonomyName() {
		return taxonomyName;
	}
	public void setTaxonomyName(Long taxonomyName) {
		this.taxonomyName = taxonomyName;
	}

	
}
