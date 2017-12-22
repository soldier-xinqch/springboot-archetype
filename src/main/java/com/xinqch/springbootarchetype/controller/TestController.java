package com.xinqch.springbootarchetype.controller;

import com.xinqch.springbootarchetype.entity.TestTab;
import com.xinqch.springbootarchetype.service.TestTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 *
 * @auther xinch
 * @create 2017/12/22 17:15
 */
@RestController
public class TestController {

    @Autowired
    private TestTabService testTabService;

    @RequestMapping(value = "/getShop")
    public TestTab getShop(@RequestParam("id") String id) {
        System.out.println("id = [" + id + "]");
        TestTab t1 = testTabService.getById(id);
        System.out.println("id = [" + t1.getId()+"---"+ t1.getMessage()+ "]");
        TestTab t2 = testTabService.getByIdSlave(id);
        System.out.println("id = [" + t2.getId()+"---"+ t2.getMessage() + "]");

        return t1;
    }


}
