package com.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:08:48
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}
