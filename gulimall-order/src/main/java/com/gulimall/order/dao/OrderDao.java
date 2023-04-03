package com.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:07:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
