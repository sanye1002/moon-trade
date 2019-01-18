package cn.moon.trade.core.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc 礼物列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GiftInfo implements Serializable {
    private static final long serialVersionUID = 1217022449611138652L;
    @TableId
    private String giftId;
    /** 平台编号*/
    private String platformIdentifier;
    /** 礼物名称*/
    private String giftName;
    /** 礼物图片*/
    private String giftImg;
    /** 礼物原价*/
    private BigDecimal giftOriginalPrice;
    /** 创建时间. */
    private Date createTime;
    /** 更新时间. */
    private Date updateTime;
}
