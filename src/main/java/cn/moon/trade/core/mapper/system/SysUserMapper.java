package cn.moon.trade.core.mapper.system;

import cn.moon.trade.core.entity.system.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

}
