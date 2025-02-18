package org.notes.controller;


import org.notes.service.MailCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xc
 * @Description: 邮箱验证码，处理验证码的发送和验证请求
 * @Date: 2025/2/18 9:54
 * @Version: 1.0
 */
@RestController
@RequestMapping("/mailcode")
public class MailCodeController {
    @Autowired
    private MailCodeService mailCodeService;
    /**
     * 发送验证码
     * @param mail 目标邮箱地址
     * @return
     */
    @GetMapping("/send")
    public ResponseEntity<String> sendCode(@RequestParam("mail") String mail){
        try {
            mailCodeService.generateMailCode(mail);
            return ResponseEntity.ok("验证码发送成功");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("验证码发送失败"+e.getMessage());
        }
    }
    /**
     * 验证验证码
     * @param mail 目标邮箱地址
     * @param code 用户输入的验证码
     * @return
     */
    public ResponseEntity<String> verifyCode(
            @RequestParam("mail") String mail,
            @RequestParam("code") String code){
        try {
            boolean result = mailCodeService.checkCode(mail, code);
            if (result){
                return ResponseEntity.ok("验证码正确");
            }else {
                return ResponseEntity.badRequest().body("验证码错误");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("验证码验证失败"+e.getMessage());
        }
    }
}











