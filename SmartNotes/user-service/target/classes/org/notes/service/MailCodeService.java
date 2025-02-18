package org.notes.service;

import org.springframework.stereotype.Service;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:36
 * @Version: 1.0
 */
@Service
public interface MailCodeService {
    /**
     * 用于生成邮箱验证码
     * @return
     */
    public String generateMailCode(String mail);

    /**
     * 用于验证邮箱验证码
     */
    public boolean checkCode(String mail,String code);
}
