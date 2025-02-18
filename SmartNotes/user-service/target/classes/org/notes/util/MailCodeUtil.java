package org.notes.util;

import org.springframework.cache.annotation.Cacheable;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 10:39
 * @Version: 1.0
 */
public class MailCodeUtil {

    /**
     * 生成6位邮箱验证码
     * @param
     * @return
     */
    public String generateMailCode() {
        return String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
    }

    /**
     * 从缓存区中取邮箱验证码
     * @param
     * @return
     */
    @Cacheable(value = "mailCode", key = "#mail")
    public String getCode(String mail) {
        return null;
    }
}
