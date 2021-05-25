package com.example.second.service;

import com.example.second.entity.Ershang;

import java.util.List;


public interface ErshangService {

    public List<Ershang> findAllErshangs();

    public void addErshang(Ershang ershang);

    public void deleteErshangById(Long uid);

    public void updateErshang(Ershang ershang);

    List<Ershang> findErshangByName(String name);

    public Integer deleteErshangsByIds(Integer[] ids);
}
