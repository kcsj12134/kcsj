package com.example.second.controller;

import com.example.second.entity.Yixia;
import com.example.second.service.MenuService;
import com.example.second.service.YixiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yixia")
@CrossOrigin(allowCredentials = "true")
public class YixiaController {

    @Autowired
    private YixiaService yixiaService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllYixias")
    public List<Yixia> findAllYixias() {
        return this.yixiaService.findAllYixias();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addYixia")
    public void addYixia(@RequestBody Yixia yixia) {
        this.yixiaService.addYixia(yixia);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteYixia")
    public void deleteYixiaById(@RequestParam Long uid) {
        this.yixiaService.deleteYixiaById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateYixia")
    public void updateYixia(@RequestBody Yixia yixia) {
        this.yixiaService.updateYixia(yixia);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findYixiaByName")
    public List<Yixia> findYixiaByName(@RequestParam String name) {
        return this.yixiaService.findYixiaByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteYixiasByIds")
    public Integer deleteYixiasByIds(Integer[] ids) {
        return this.yixiaService.deleteYixiasByIds(ids);
    }
}
