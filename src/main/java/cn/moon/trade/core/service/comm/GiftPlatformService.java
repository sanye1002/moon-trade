package cn.moon.trade.core.service.comm;

import cn.moon.trade.core.dto.comm.giftPlatform.AddGiftPlatformDTO;
import cn.moon.trade.core.dto.comm.giftPlatform.UpdateGiftPlatformDTO;
import cn.moon.trade.core.entity.GiftPlatform;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
public interface GiftPlatformService extends IService<GiftPlatform> {
    /**
     * 新加礼物平台
     * @param dto
     */
    void insertGiftPlatform(AddGiftPlatformDTO dto);

    /**
     * 修改平台
     * @param dto
     */
    void updateGiftPlatform(UpdateGiftPlatformDTO dto);

    /**
     * 删除
     * @param ids
     */
    void deleteGiftPlatformByIds(List<String> ids);

    /**
     * 查询
     * @param page
     * @param size
     * @return
     */
    Page<GiftPlatform> selectPageGiftPlatform(Integer page,Integer size);

}
