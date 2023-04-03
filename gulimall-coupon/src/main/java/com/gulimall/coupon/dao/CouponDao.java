package com.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:08:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
