package cn.ancony.computer.controller;

import cn.ancony.computer.entity.User;
import cn.ancony.computer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> getById() {
        return userService.getAll();
    }
}
