package com.example.second.controller;


import com.example.second.entity.Yishang;
import com.example.second.service.MenuService;
import com.example.second.service.YishangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yishang")
@CrossOrigin(allowCredentials = "true")
public class YishangController {

    @Autowired
    private YishangService yishangService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllYishangs")
    public List<Yishang> findAllYishangs() {
        return this.yishangService.findAllYishangs();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addYishang")
    public void addYishang(@RequestBody Yishang yishang) {
        this.yishangService.addYishang(yishang);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteYishang")
    public void deleteYishangById(@RequestParam Long uid) {
        this.yishangService.deleteYishangById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateYishang")
    public void updateYishang(@RequestBody Yishang yishang) {
        this.yishangService.updateYishang(yishang);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findYishangByName")
    public List<Yishang> findYishangByName(@RequestParam String name) {
        return this.yishangService.findYishangByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteYishangsByIds")
    public Integer deleteYishangsByIds(Integer[] ids) {
        return this.yishangService.deleteYishangsByIds(ids);
    }
}
