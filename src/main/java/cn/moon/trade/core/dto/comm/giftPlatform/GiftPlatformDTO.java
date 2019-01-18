package cn.moon.trade.core.dto.comm.giftPlatform;

import lombok.Data;

import java.util.Date;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Data
public class GiftPlatformDTO {

    private String platformId;
    /** 平台名称*/
    private String platformName;
    /** 平台编号*/
    private String platformIdentifier;
    /** 创建时间. */
    private Date createTime;
    /** 更新时间. */
    private Date updateTime;
}
