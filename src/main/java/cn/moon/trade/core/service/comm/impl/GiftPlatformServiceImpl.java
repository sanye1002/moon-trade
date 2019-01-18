package cn.moon.trade.core.service.comm.impl;

import cn.moon.trade.common.exception.RequestException;
import cn.moon.trade.core.dto.comm.giftPlatform.AddGiftPlatformDTO;
import cn.moon.trade.core.dto.comm.giftPlatform.UpdateGiftPlatformDTO;
import cn.moon.trade.core.entity.GiftInfo;
import cn.moon.trade.core.entity.GiftPlatform;
import cn.moon.trade.core.mapper.GiftPlatformMapper;
import cn.moon.trade.core.service.comm.GiftInfoService;
import cn.moon.trade.core.service.comm.GiftPlatformService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Service
@Transactional
public class GiftPlatformServiceImpl extends ServiceImpl<GiftPlatformMapper, GiftPlatform> implements GiftPlatformService {
    @Autowired
    private GiftInfoService giftInfoService;

    @Override
    public void insertGiftPlatform(AddGiftPlatformDTO dto) {
        try {
            GiftPlatform giftPlatform = new GiftPlatform();
            BeanUtils.copyProperties(dto, giftPlatform);
            this.insert(giftPlatform);
        } catch (Exception e) {
            throw RequestException.fail("保存数据失败", e);
        }
    }

    @Override
    public void updateGiftPlatform(UpdateGiftPlatformDTO dto) {
        try {
            GiftPlatform giftPlatform = new GiftPlatform();
            BeanUtils.copyProperties(dto, giftPlatform);
            giftPlatform.setUpdateTime(new Date());
            this.updateById(giftPlatform);
        } catch (Exception e) {
            throw RequestException.fail("修改数据失败", e);
        }
    }

    @Override
    public void deleteGiftPlatformByIds(List<String> ids) {
        List<GiftInfo> list = new ArrayList<>();
        try {
            EntityWrapper<GiftInfo> wrapper = new EntityWrapper<>();
            wrapper.in("platform_identifier", ids);
            list = giftInfoService.selectList(wrapper);
        } catch (Exception e) {
            throw RequestException.fail("删除数据失败", e);
        }
        if (!list.isEmpty()) {
            throw RequestException.fail("删除的平台中含有礼物");
        }
        try {

            this.deleteBatchIds(ids);
        } catch (Exception e) {
            throw RequestException.fail("删除数据失败", e);
        }
    }

    @Override
    public Page<GiftPlatform> selectPageGiftPlatform(Integer page, Integer size) {
        try {
            Page<GiftPlatform> platformPage = new Page<>(page, size);
            return this.selectPage(platformPage);
        } catch (Exception e) {
            throw RequestException.fail("查询数据失败", e);
        }
    }
}
