package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:DiscussPostMapper
 * package:com.nowcoder.community.dao
 * Description:
 *
 * @Date: 2022/8/18 13:54
 * @Author: chenshanliang
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param注解用于给参数取别名
    //如果只有一个参数,并且要在<if>里使用,则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
