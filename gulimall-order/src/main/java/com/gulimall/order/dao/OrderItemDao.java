package com.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.order.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:07:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
