package org.notes.service;

import org.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:36
 * @Version: 1.0
 */
@Service
public interface LoginService {
    User login(String email);

}
