package com.lzy.xier.member.dao;

import com.lzy.xier.common.dao.BaseDao;
import com.lzy.xier.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Mapper
public interface MemberDao extends BaseDao<MemberEntity> {
	
}