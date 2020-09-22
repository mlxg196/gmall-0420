package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author wujin
 * @email 1735744134@qq.com
 * @date 2020-09-21 19:30:30
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
