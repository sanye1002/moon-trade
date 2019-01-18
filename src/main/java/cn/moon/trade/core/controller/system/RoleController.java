package cn.moon.trade.core.controller.system;

import cn.moon.trade.common.controller.CrudController;
import cn.moon.trade.core.dto.system.role.FindRoleDTO;
import cn.moon.trade.core.dto.system.role.RoleAddDTO;
import cn.moon.trade.core.dto.system.role.RoleUpdateDTO;
import cn.moon.trade.core.entity.system.SysRole;
import cn.moon.trade.core.service.system.SysRoleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author Moon
 * @version 2018/4/19/9:41
 */
@RestController
@RequestMapping(value = {"/system/role"})
@Api(tags = {"角色管理"})
public class RoleController implements CrudController<SysRole,RoleAddDTO,RoleUpdateDTO,String,FindRoleDTO,SysRoleService>{

    private final SysRoleService sysRoleService;

    @Autowired
    public RoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }

    @Override
    public SysRoleService getService() {
        return sysRoleService;
    }
}
