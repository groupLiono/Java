package com.example.second.controller;


import com.example.second.entity.Cqnu;
import com.example.second.service.CqnuService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cqnu")
@CrossOrigin(allowCredentials = "true")
public class CqnuController {

    @Autowired
    private CqnuService cqnuService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllCqnus")
    public List<Cqnu> findAllCqnus() {
        return this.cqnuService.findAllCqnus();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addCqnu")
    public void addCqnu(@RequestBody Cqnu cqnu) {
        this.cqnuService.addCqnu(cqnu);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteCqnu")
    public void deleteCqnuById(@RequestParam Long uid) {
        this.cqnuService.deleteCqnuById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateCqnu")
    public void updateCqnu(@RequestBody Cqnu cqnu) {
        this.cqnuService.updateCqnu(cqnu);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findCqnuByName")
    public List<Cqnu> findCqnuByName(@RequestParam String name) {
        return this.cqnuService.findCqnuByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteCqnusByIds")
    public Integer deleteCqnusByIds(Integer[] ids) {
        return this.cqnuService.deleteCqnusByIds(ids);
    }
}
