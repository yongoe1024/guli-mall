package com.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:07:30
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
