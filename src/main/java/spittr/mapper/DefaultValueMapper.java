package spittr.mapper;

import java.util.List;

import com.github.pagehelper.Page;

import spittr.entity.DefaultValue;

public interface DefaultValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DefaultValue record);

    int insertSelective(DefaultValue record);

    DefaultValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DefaultValue record);

    int updateByPrimaryKey(DefaultValue record);
    
    List<DefaultValue> findByPage();
}