package com.example.second.service.impl;

import com.example.second.dao.ErshangDao;
import com.example.second.entity.Ershang;
import com.example.second.service.ErshangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class ErshangServiceBean implements ErshangService {

    @Autowired
    private ErshangDao ershangDao;


    public List<Ershang> findAllErshangs() {
        return this.ershangDao.findAllErshangs();
    }


    @Transactional
    public void addErshang(Ershang ershang) {
        this.ershangDao.addErshang(ershang);
//        this.ershangCopyDao.addErshang(ershang);
        Integer count = this.ershangDao.getCountErshangs();
    }

    public void deleteErshangById(Long uid) {
        this.ershangDao.deleteErshangById(uid);
        Integer count = this.ershangDao.getCountErshangs();
    }

    public void updateErshang(Ershang ershang) {
        this.ershangDao.updateErshang(ershang);
    }

    public List<Ershang> findErshangByName(String name) {
        return this.ershangDao.findErshangByName(name);
    }

    public Integer deleteErshangsByIds(Integer[] ids) {
        return this.ershangDao.deleteErshangsByIds(ids);
    }

}
