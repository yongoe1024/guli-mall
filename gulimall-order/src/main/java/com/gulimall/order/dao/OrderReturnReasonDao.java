package com.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.order.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:07:30
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {

}
