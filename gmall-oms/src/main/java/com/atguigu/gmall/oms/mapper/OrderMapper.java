package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wujin
 * @email 1735744134@qq.com
 * @date 2020-09-21 19:07:11
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
