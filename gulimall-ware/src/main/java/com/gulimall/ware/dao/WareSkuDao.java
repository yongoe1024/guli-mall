package com.gulimall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:09:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}
