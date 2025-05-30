package com.example.charge.controller;

import com.example.charge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
@CrossOrigin // 允许前端跨域访问
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> body) {
        boolean success = userService.register(body.get("username"), body.get("password"));
        return success ? ResponseEntity.ok("注册成功") : ResponseEntity.badRequest().body("用户名已存在");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        boolean success = userService.login(body.get("username"), body.get("password"));
        return success ? ResponseEntity.ok("登录成功") : ResponseEntity.status(401).body("用户名或密码错误");
    }
}

