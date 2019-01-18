package cn.moon.trade.core.service.system.impl;

import cn.moon.trade.core.entity.system.SysUserRole;
import cn.moon.trade.core.mapper.system.SysUserRoleMapper;
import cn.moon.trade.core.service.system.SysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author moon
 * @version 2018/4/16/11:32
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper,SysUserRole> implements SysUserRoleService {
}
