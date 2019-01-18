package cn.moon.trade.core.mapper;

import cn.moon.trade.core.entity.GiftInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Mapper
@Repository
public interface GiftInfoMapper extends BaseMapper<GiftInfo> {
}
