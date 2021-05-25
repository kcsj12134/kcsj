package com.example.second.dao;

import com.example.second.entity.Yixia;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "YixiaDao")
public interface YixiaDao {

    List<Yixia> findAllYixias();

    int deleteYixiaById(Long uid);

    int insert(Yixia yixia);

    int addYixia(Yixia yixia);

    Yixia selectByPrimaryKey(Long uid);

    int updateYixia(Yixia yixia);

    int updateByPrimaryKey(Yixia yixia);

    List<Yixia> findYixiaByName(String name);

    Integer deleteYixiasByIds(@Param("ids") Integer[] ids);

    int getCountYixias();
}
