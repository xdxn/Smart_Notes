package org.notes.service.impl;

import org.notes.service.MailCodeService;
import org.notes.util.MailCodeUtil;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 10:37
 * @Version: 1.0
 */
@Service
public class MailCodeServiceImpl implements MailCodeService {

    private MailCodeUtil mailCodeUtil;



    @CachePut(value = "mailCode", key = "#mail")
    @Override
    public String generateMailCode(String mail) {
        return null;
    }

    @Override
    public boolean checkCode(String mail, String code) {
        return false;
    }
}
