package cn.moon.trade.core.service.comm.impl;

import cn.moon.trade.common.exception.RequestException;
import cn.moon.trade.core.dto.comm.giftInfo.AddGiftInfoDTO;
import cn.moon.trade.core.dto.comm.giftInfo.UpdateGiftInfoDTO;
import cn.moon.trade.core.entity.GiftInfo;
import cn.moon.trade.core.mapper.GiftInfoMapper;
import cn.moon.trade.core.service.comm.GiftInfoService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Service
@Transactional
public class GiftInfoServiceImpl extends ServiceImpl<GiftInfoMapper,GiftInfo> implements GiftInfoService {

    @Override
    public void insertGiftInfo(AddGiftInfoDTO dto) {
        try {
            GiftInfo giftInfo = new GiftInfo();
            BeanUtils.copyProperties(dto,giftInfo);
            this.insert(giftInfo);
        }catch (Exception e){
            throw RequestException.fail("数据保存失败",e);
        }
    }

    @Override
    public void updateGiftInfo(UpdateGiftInfoDTO dto) {
        try {
            GiftInfo giftInfo = new GiftInfo();
            BeanUtils.copyProperties(dto,giftInfo);
            giftInfo.setUpdateTime(new Date());
            this.updateById(giftInfo);
        }catch (Exception e){
            throw RequestException.fail("数据更新失败",e);
        }
    }

    @Override
    public void deleteGiftInfoByIds(List<String> ids) {
        try {
            this.deleteBatchIds(ids);
        }catch (Exception e){
            throw RequestException.fail("数据删除失败",e);
        }
    }

    @Override
    public Page<GiftInfo> selectPageGiftInfo(Integer page, Integer size) {
        try {
            Page<GiftInfo> giftInfoPage = new Page<>(page,size);

            return this.selectPage(giftInfoPage);
        }catch (Exception e){
            throw RequestException.fail("数据查询失败",e);
        }
    }

    @Override
    public List<GiftInfo> selectListByPlatformIdentifier(String platformIdentifier) {

        try {
            EntityWrapper<GiftInfo> wrapper = new EntityWrapper<>();
            wrapper.eq("platform_identifier",platformIdentifier);
            return this.selectList(wrapper);
        }catch (Exception e){
            throw RequestException.fail("数据查询失败",e);
        }
    }
}
