package com.redq.latte.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import com.redq.latte.model.BaseEntity;

public interface CrudMapper<T extends BaseEntity> {

    int insert(T entity);
    
    int update(T entity);

    int deleteById(Long id);
    
    T selectById(@Param("id") Long id);
    
    List<T> selectAll(@Param("pager") Pageable pager);
    
    List<T> selectPage(@Param("entity") T object, @Param("offset") int offset, @Param("limit") int limit);
    
}
