package com.example.demo;

import com.itcast.starter.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/7.
 */
@RestController
public class FormatController {

    /**
     *
     */
    @Autowired
    public HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String format(){
        User user = new User();
        user.setAge(18);
        user.setName("cyy");
        return helloFormatTemplate.doFormat(user);
    }



}
