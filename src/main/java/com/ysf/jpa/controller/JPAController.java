package com.ysf.jpa.controller;

import com.ysf.jpa.jpa.SB;
import com.ysf.jpa.repository.ISBRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName JPAController
 * @Description JPAController
 * @Author admin
 * @Date 2019/11/21 10:44
 */

@RestController
@RequestMapping("/sb")
public class JPAController {
    @Autowired
    private ISBRepository ISBRepository;

    //查询
    @RequestMapping(value = "/findAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询所有数据")
    @ResponseBody
    public List<SB> findAll() {
        return ISBRepository.findAll();
    }

    @RequestMapping(value = "/findById", method = {RequestMethod.GET})
    @ApiOperation(value = "根据主键查询数据")
    @ResponseBody
    public SB findById(@RequestParam(value = "id") String id) {
        return ISBRepository.findById(id);
    }

    @RequestMapping(value = "/findAllByXAndY", method = {RequestMethod.GET})
    @ApiOperation(value = "根据属性（x和y）查询数据")
    @ResponseBody
    public List<SB> findAllByXAndY(@RequestParam(value = "x") String x, @RequestParam(value = "y") String y) {
        return ISBRepository.findAllByXAndY(x, y);
    }

    @RequestMapping(value = "/findAllByX", method = {RequestMethod.GET})
    @ApiOperation(value = "根据属性（x）查询数据")
    @ResponseBody
    public List<SB> findAllByX(@RequestParam(value = "x") String x) {
        return ISBRepository.findAllByX(x);
    }

    @RequestMapping(value = "/findAllOrderBySbTimeDesc", method = {RequestMethod.GET})
    @ApiOperation(value = "查询所有并按属性排序—逆序")
    @ResponseBody
    public List<SB> findAllOrderBySbTimeDesc() {
        return ISBRepository.findAllByOrderBySbTimeDesc();
    }

    @RequestMapping(value = "/findAllOrderBySbTime", method = {RequestMethod.GET})
    @ApiOperation(value = "查询所有并按属性排序—顺序")
    @ResponseBody
    public List<SB> findAllOrderBySbTime() {
        return ISBRepository.findAllByOrderBySbTime();
    }


}
