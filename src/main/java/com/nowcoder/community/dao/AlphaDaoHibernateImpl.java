package com.nowcoder.community.dao;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * ClassName:AlphaDaoHibernateImpl
 * package:com.nowcoder.community.dao
 * Description:
 *
 * @Date: 2022/8/17 19:29
 * @Author: chenshanliang
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
