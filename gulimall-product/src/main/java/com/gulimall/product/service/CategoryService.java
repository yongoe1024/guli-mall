package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Mr.Guo
 * @since 2022-10-04 14:56:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> catIds);

    /*
     *找到catelogId的完整路径
     */
    Long[] findCatelogPath(Long catelogId);

    /*
     * 级联更新所有关联的数据
     */
    void updateCascade(CategoryEntity category);
}

