package com.redq.latte.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import com.redq.latte.model.BaseEntity;
import com.redq.latte.model.Order;

public interface CrudMapper<E extends BaseEntity> {

    int insert(E record);
    
    E selectById(Long id);
    
    List<E> selectAll(@Param("pager") Pageable pager);
    
    int updateById(Order record);

    int deleteById(Long id);
    
}
