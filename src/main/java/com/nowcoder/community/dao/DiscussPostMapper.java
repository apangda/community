package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//接口被容器扫描到，装配
@Mapper
public interface DiscussPostMapper {

    //查询，返回list
    //userId:我的帖子
    //分页：起始行号offset，每页最多显示数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //查询帖子的总行数
    //@Param,给参数起别名
    //动态拼接条件<if>，方法只有一个参数，不起别名会报错
    int selectDiscussPostRows(@Param("userId") int userId);

}
