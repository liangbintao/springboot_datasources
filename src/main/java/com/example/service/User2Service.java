package com.example.service;

import com.example.mapper.db2.IUser2Mapper;
import com.example.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName User1Service
 * @Description TODO
 * @Auther lbt
 * @Date 2019/6/28/028 10:12
 * @Version 1.0
 */
@Service
@SuppressWarnings("all")
public class User2Service {

    @Autowired
    private IUser2Mapper user2Mapper;

    public List<UserPo> findAll() {

        return user2Mapper.findAll();
    }
}
