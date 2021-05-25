package com.example.second.service;

import com.example.second.entity.Yishang;

import java.util.List;


public interface YishangService {

    public List<Yishang> findAllYishangs();

    public void addYishang(Yishang yishang);

    public void deleteYishangById(Long uid);

    public void updateYishang(Yishang yishang);

    List<Yishang> findYishangByName(String name);

    public Integer deleteYishangsByIds(Integer[] ids);
}
