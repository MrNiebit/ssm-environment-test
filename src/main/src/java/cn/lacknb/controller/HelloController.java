package cn.lacknb.controller;

import cn.lacknb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello () {
        return "Hello SSM ";
    }

    @GetMapping("/list")
    public Map<String, Object> find () {


        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("datas", userService.selectList());
        return map;
    }

}
