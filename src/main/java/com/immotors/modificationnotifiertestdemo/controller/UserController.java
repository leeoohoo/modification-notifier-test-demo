package com.immotors.modificationnotifiertestdemo.controller;

import com.immotors.modificationnotifiertestdemo.client.SecurityFeignClient;
import com.immotors.modificationnotifiertestdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author lilei
 * @date 6/25/24
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private SecurityFeignClient securityFeignClient;


    /**
     * 根据名称关键字查询相应的节点信息
     * @param
     * @return 返回查询操作响应信息，包含查询结果集(如果查询到数据)
     */

    @PostMapping("save")
    public void save() {
        userService.save();

    }
    /**
     * test
     * @param
     * @return
     */
    @PostMapping("add")
    public void add() {
        userService.add();

    }

}
