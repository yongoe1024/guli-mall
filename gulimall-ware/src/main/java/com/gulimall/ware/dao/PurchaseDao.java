package com.gulimall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.ware.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:09:20
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {

}
