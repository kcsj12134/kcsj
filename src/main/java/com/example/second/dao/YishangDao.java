package com.example.second.dao;

import com.example.second.entity.Yishang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "YishangDao")
public interface YishangDao {

    List<Yishang> findAllYishangs();

    int deleteYishangById(Long uid);

    int insert(Yishang yishang);

    int addYishang(Yishang yishang);

    Yishang selectByPrimaryKey(Long uid);

    int updateYishang(Yishang yishang);

    int updateByPrimaryKey(Yishang yishang);

    List<Yishang> findYishangByName(String name);

    Integer deleteYishangsByIds(@Param("ids") Integer[] ids);

    int getCountYishangs();
}
