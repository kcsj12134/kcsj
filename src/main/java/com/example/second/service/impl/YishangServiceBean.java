package com.example.second.service.impl;

import com.example.second.dao.YishangDao;
import com.example.second.entity.Yishang;
import com.example.second.service.YishangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class YishangServiceBean implements YishangService {

    @Autowired
    private YishangDao yishangDao;


    public List<Yishang> findAllYishangs() {
        return this.yishangDao.findAllYishangs();
    }


    @Transactional
    public void addYishang(Yishang yishang) {
        this.yishangDao.addYishang(yishang);
//        this.yishangCopyDao.addYishang(yishang);
        Integer count = this.yishangDao.getCountYishangs();
    }

    public void deleteYishangById(Long uid) {
        this.yishangDao.deleteYishangById(uid);
        Integer count = this.yishangDao.getCountYishangs();
    }

    public void updateYishang(Yishang yishang) {
        this.yishangDao.updateYishang(yishang);
    }

    public List<Yishang> findYishangByName(String name) {
        return this.yishangDao.findYishangByName(name);
    }

    public Integer deleteYishangsByIds(Integer[] ids) {
        return this.yishangDao.deleteYishangsByIds(ids);
    }

}
