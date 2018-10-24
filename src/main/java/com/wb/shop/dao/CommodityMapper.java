package com.wb.shop.dao;

import com.wb.shop.domain.Commodity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityMapper {
    
    int deleteByPrimaryKey(Long id);

    
    int insert(Commodity record);

    
    int insertSelective(Commodity record);

    
    Commodity selectByPrimaryKey(Long id);

    
    int updateByPrimaryKeySelective(Commodity record);

    
    int updateByPrimaryKeyWithBLOBs(Commodity record);

    
    int updateByPrimaryKey(Commodity record);
}