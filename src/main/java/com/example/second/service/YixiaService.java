package com.example.second.service;

import com.example.second.entity.Yixia;

import java.util.List;


public interface YixiaService {

    public List<Yixia> findAllYixias();

    public void addYixia(Yixia yixia);

    public void deleteYixiaById(Long uid);

    public void updateYixia(Yixia yixia);

    List<Yixia> findYixiaByName(String name);

    public Integer deleteYixiasByIds(Integer[] ids);
}
