package com.example.second.dao;

import com.example.second.entity.Ershang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "ErshangDao")
public interface ErshangDao {

    List<Ershang> findAllErshangs();

    int deleteErshangById(Long uid);

    int insert(Ershang ershang);

    int addErshang(Ershang ershang);

    Ershang selectByPrimaryKey(Long uid);

    int updateErshang(Ershang ershang);

    int updateByPrimaryKey(Ershang ershang);

    List<Ershang> findErshangByName(String name);

    Integer deleteErshangsByIds(@Param("ids") Integer[] ids);

    int getCountErshangs();
}
