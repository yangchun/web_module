package com.controller;

/**
 * Created by Administrator on 2017/9/27 0027.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.api.UseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userController")
public class TestController {

    @Autowired
    private UseService useService;

    @RequestMapping("/getAccount")
    @ResponseBody
    public String getAccount(){
        return useService.getAccountById(1L);
    }

}
