package com.example.second.controller;

import com.example.second.entity.Ershang;
import com.example.second.service.MenuService;
import com.example.second.service.ErshangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ershang")
@CrossOrigin(allowCredentials = "true")
public class ErshangController {

    @Autowired
    private ErshangService ershangService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllErshangs")
    public List<Ershang> findAllErshangs() {
        return this.ershangService.findAllErshangs();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addErshang")
    public void addErshang(@RequestBody Ershang ershang) {
        this.ershangService.addErshang(ershang);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteErshang")
    public void deleteErshangById(@RequestParam Long uid) {
        this.ershangService.deleteErshangById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateErshang")
    public void updateErshang(@RequestBody Ershang ershang) {
        this.ershangService.updateErshang(ershang);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findErshangByName")
    public List<Ershang> findErshangByName(@RequestParam String name) {
        return this.ershangService.findErshangByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteErshangsByIds")
    public Integer deleteErshangsByIds(Integer[] ids) {
        return this.ershangService.deleteErshangsByIds(ids);
    }
}
