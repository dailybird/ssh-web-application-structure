package com.ecollaboration.controllers;

import com.ecollaboration.entities.UserEntity;
import com.ecollaboration.services.TestService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by dailybird on 17/2/3.
 *
 */
@Controller
@RequestMapping(path = "/test")
public class TestController {
    @Resource private TestService testService;

    @RequestMapping(path = "/lll")
    public String ooo(){
        testService.getTest();
        return "test";
    }
}
