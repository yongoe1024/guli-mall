package com.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.member.entity.MemberCollectSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:08:48
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {

}
