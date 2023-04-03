package com.gulimall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.ware.entity.WareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:09:21
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {

}
