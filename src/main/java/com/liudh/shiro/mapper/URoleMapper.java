package com.liudh.shiro.mapper;

import java.util.List;

import com.liudh.shiro.pojo.URole;
import com.liudh.shiro.pojo.URoleExample;
import org.apache.ibatis.annotations.Param;

public interface URoleMapper {

    int countByExample(URoleExample example);

    int deleteByExample(URoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(URole record);

    int insertSelective(URole record);

    List<URole> selectByExample(URoleExample example);

    URole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") URole record, @Param("example") URoleExample example);

    int updateByExample(@Param("record") URole record, @Param("example") URoleExample example);

    int updateByPrimaryKeySelective(URole record);

    int updateByPrimaryKey(URole record);

    List<URole> selectRoleByUserId(Long id);
}