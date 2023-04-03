package com.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author Mr.Guo
 * @since 2022-10-04 14:56:51
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
