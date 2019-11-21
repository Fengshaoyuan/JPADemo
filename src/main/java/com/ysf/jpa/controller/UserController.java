package com.ysf.jpa.controller;

import com.ysf.jpa.jpa.User;
import com.ysf.jpa.repository.IUserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserController
 * @Description UserController
 * @Author admin
 * @Date 2019/11/21 14:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserRepository iUserRepository;

    //查询
    @RequestMapping(value = "/findLeadUserByDeptName", method = {RequestMethod.GET})
    @ApiOperation(value = "根据部门名称查询部门领导")
    @ResponseBody
    public List<User> findLeadUserByDeptName(@RequestParam(value = "部门名称") String deptname) {
        return iUserRepository.findLeadUserByDeptName(deptname);
    }
}
