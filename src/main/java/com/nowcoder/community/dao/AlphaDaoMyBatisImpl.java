package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * ClassName:AlphaDaoMyBatisImpl
 * package:com.nowcoder.community.dao
 * Description:
 *
 * @Date: 2022/8/17 19:36
 * @Author: chenshanliang
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
