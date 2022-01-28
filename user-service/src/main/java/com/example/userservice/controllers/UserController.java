package com.example.userservice.controllers;


import com.example.userservice.VO.ResponseTemplateVO;
import com.example.userservice.entities.User;
import com.example.userservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
//    @HystrixCommand(fallbackMethod = "userServiceFallBack")
    public User saveUser (@RequestBody User user){
        log.info("from save user controller");
        userService.saveUser(user);
        return user;
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO findUserWithDepartment(@PathVariable("id") Long userId){
        log.info("from find user controller");
       return userService.findUserWithDepartment(userId);
    }


}
