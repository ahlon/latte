package com.redq.latte.common.response;

import org.springframework.data.domain.Pageable;

public class RestListDataResponse<T> extends RestDataResponse<T> {
	
	private Pageable pager;

	public RestListDataResponse(T data, Pageable pager) {
		super(data);
		this.pager = pager;
	}

	public Pageable getPager() {
		return pager;
	}

	public void setPager(Pageable pager) {
		this.pager = pager;
	}
}
