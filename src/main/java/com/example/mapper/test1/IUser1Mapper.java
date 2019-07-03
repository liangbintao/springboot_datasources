package com.example.mapper.test1;

import com.example.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName IUser2Mapper
 * @Description TODO
 * @Auther lbt
 * @Date 2019/6/28/028 10:09
 * @Version 1.0
 */
@Mapper
public interface IUser1Mapper {

    // @Select("select * from user")
    List<UserPo> findAll();
}
