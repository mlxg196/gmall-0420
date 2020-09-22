package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.GrowthHistoryEntity;

import java.util.Map;

/**
 * 成长积分记录表
 *
 * @author wujin
 * @email 1735744134@qq.com
 * @date 2020-09-21 19:30:30
 */
public interface GrowthHistoryService extends IService<GrowthHistoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

