package cn.moon.trade.core.mapper.system;

import cn.moon.trade.core.entity.system.SysUserRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy
 * @version 2018/4/16/11:31
 */
@Mapper
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}
