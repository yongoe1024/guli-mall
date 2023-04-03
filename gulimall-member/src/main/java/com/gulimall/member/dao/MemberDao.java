package com.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gulimall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author Mr.Guo
 * @since 2022-10-04 15:08:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
