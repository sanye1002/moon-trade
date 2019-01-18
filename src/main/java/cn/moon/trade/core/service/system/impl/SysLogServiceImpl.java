package cn.moon.trade.core.service.system.impl;

import cn.moon.trade.common.bean.ResponseCode;
import cn.moon.trade.common.exception.RequestException;
import cn.moon.trade.core.dto.system.log.FindLogDTO;
import cn.moon.trade.core.entity.system.SysLog;
import cn.moon.trade.core.mapper.system.SysLogMapper;
import cn.moon.trade.core.service.system.SysLogService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author moon
 * @version 2018/4/28/9:57
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper,SysLog> implements SysLogService {

    @Override
    public Page<SysLog> list(FindLogDTO findLogDTO) {
        EntityWrapper<SysLog> wrapper = new EntityWrapper<>();
        wrapper.orderBy("create_date",findLogDTO.getAsc());
        return this.selectPage(new Page<>(findLogDTO.getPage(),findLogDTO.getPageSize()),wrapper);
    }

    @Override
    public void remove(List<String> idList) {
        try {
            this.deleteBatchIds(idList);
        }catch (Exception e){
            throw new RequestException(ResponseCode.FAIL.code,"批量删除日志失败",e);
        }
    }
}
