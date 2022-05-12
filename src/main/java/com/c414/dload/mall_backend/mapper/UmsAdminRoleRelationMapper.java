package com.c414.dload.mall_backend.mapper;

import com.c414.dload.mall_backend.entity.UmsAdminRoleRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.c414.dload.mall_backend.entity.UmsPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 后台用户和角色关系表 Mapper 接口
 * </p>
 *
 * @author dload
 * @since 2022-05-12
 */
@Mapper
public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {

    List<UmsPermission> selectPermission(Long adminId);

}
