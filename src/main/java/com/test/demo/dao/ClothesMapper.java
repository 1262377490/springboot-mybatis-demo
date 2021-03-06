package com.test.demo.dao;

import com.test.demo.bean.Clothes;
import com.test.demo.bean.ClothesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothesMapper {
    int countByExample(ClothesExample example);

    int deleteByExample(ClothesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Clothes record);

    int insertSelective(Clothes record);

    List<Clothes> selectByExample(ClothesExample example);

    Clothes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Clothes record, @Param("example") ClothesExample example);

    int updateByExample(@Param("record") Clothes record, @Param("example") ClothesExample example);

    int updateByPrimaryKeySelective(Clothes record);

    int updateByPrimaryKey(Clothes record);
}