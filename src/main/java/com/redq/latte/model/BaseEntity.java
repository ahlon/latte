package com.redq.latte.model;

import java.util.Date;

public class BaseEntity {
    
    private Long id;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private boolean archive;

    public Long getId() {
        return id;
    }

    public boolean isArchive() {
		return archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
