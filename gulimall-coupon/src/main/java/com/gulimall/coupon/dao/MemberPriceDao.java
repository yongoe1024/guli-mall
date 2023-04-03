package com.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:08:09
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
