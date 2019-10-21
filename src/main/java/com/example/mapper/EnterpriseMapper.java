package com.example.mapper;

import com.example.pojo.Enterprise;

import java.util.List;

public interface EnterpriseMapper {
    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> findEnterprise (String enterpriseId);

}