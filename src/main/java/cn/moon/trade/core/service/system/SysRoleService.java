package cn.moon.trade.core.service.system;

import cn.moon.trade.common.service.BaseService;
import cn.moon.trade.core.dto.system.role.FindRoleDTO;
import cn.moon.trade.core.dto.system.role.RoleAddDTO;
import cn.moon.trade.core.dto.system.role.RoleUpdateDTO;
import cn.moon.trade.core.entity.system.SysRole;
import cn.moon.trade.core.entity.system.SysUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface SysRoleService extends IService<SysRole>,
        BaseService<SysRole,RoleAddDTO,RoleUpdateDTO,String,FindRoleDTO> {

    /**
     * 获取指定ID用户的所有角色（并附带查询所有的角色的权限）
     * @param uid 用户ID
     * @return 角色集合
     */
    List<SysRole> findAllRoleByUserId(String uid,Boolean hasResource);

    /**
     * 更新缓存
     * @param role 角色
     * @param author 是否清空授权信息
     * @param out 是否清空session
     */
    void updateCache(SysRole role,Boolean author, Boolean out);
}
