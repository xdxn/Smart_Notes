package org.notes.controller;

import org.entity.User;
import org.notes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:53
 * @Version: 1.0
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping
    public ResponseEntity<User> loginByEmail(@RequestParam String email, @RequestParam String password) {
        User user = loginService.login(email);
        if (user != null) {
            return ResponseEntity.ok(user); // 登录成功，返回用户信息
        } else {
            return ResponseEntity.badRequest().body(null); // 登录失败，返回 null
        }
    }
}
