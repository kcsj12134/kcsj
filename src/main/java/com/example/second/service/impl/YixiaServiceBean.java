package com.example.second.service.impl;

import com.example.second.dao.YixiaDao;
import com.example.second.entity.Yixia;
import com.example.second.service.YixiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class YixiaServiceBean implements YixiaService {

    @Autowired
    private YixiaDao yixiaDao;


    public List<Yixia> findAllYixias() {
        return this.yixiaDao.findAllYixias();
    }


    @Transactional
    public void addYixia(Yixia yixia) {
        this.yixiaDao.addYixia(yixia);
//        this.yixiaCopyDao.addYixia(yixia);
        Integer count = this.yixiaDao.getCountYixias();
    }

    public void deleteYixiaById(Long uid) {
        this.yixiaDao.deleteYixiaById(uid);
        Integer count = this.yixiaDao.getCountYixias();
    }

    public void updateYixia(Yixia yixia) {
        this.yixiaDao.updateYixia(yixia);
    }

    public List<Yixia> findYixiaByName(String name) {
        return this.yixiaDao.findYixiaByName(name);
    }

    public Integer deleteYixiasByIds(Integer[] ids) {
        return this.yixiaDao.deleteYixiasByIds(ids);
    }

}
