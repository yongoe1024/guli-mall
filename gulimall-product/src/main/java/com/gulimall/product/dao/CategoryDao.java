package com.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author Mr.Guo
 * @since 2022-10-04 14:56:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
