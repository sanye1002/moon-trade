package cn.moon.trade.core.service.comm;

import cn.moon.trade.core.dto.comm.giftInfo.AddGiftInfoDTO;
import cn.moon.trade.core.dto.comm.giftInfo.UpdateGiftInfoDTO;
import cn.moon.trade.core.entity.GiftInfo;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
public interface GiftInfoService extends IService<GiftInfo> {

    /**
     * 保存
     *
     * @param dto
     */
    void insertGiftInfo(AddGiftInfoDTO dto);

    /**
     * 更新
     *
     * @param dto
     */
    void updateGiftInfo(UpdateGiftInfoDTO dto);

    /**
     * 删除
     *
     * @param ids
     */
    void deleteGiftInfoByIds(List<String> ids);

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    Page<GiftInfo> selectPageGiftInfo(Integer page, Integer size);

    /**
     * 根据编号查找
     * @param platformIdentifier
     * @return
     */
    List<GiftInfo> selectListByPlatformIdentifier(String platformIdentifier);


}
