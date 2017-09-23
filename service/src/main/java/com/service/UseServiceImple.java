package com.service;

import com.api.UseService;
import com.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/23 0023.
 */
@Service("useService")
public class UseServiceImple implements UseService {

    @Resource
    private UserDao userDao;
    public String getAccountById(long id) {
        return userDao.getById(1L).getAccount();
    }
}
