package cn.moon.trade.core.dto.comm.giftInfo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Data
public class AddGiftInfoDTO {
    /** 平台编号*/
    @NotBlank(message = "平台编号不能为空")
    private String platformIdentifier;
    /** 礼物名称*/
    @NotBlank(message = "礼物名称不能为空")
    private String giftName;
    /** 礼物图片*/
    @NotBlank(message = "礼物图片必须上传")
    private String giftImg;
    /** 礼物原价*/
    @NotBlank(message = "礼物原价不能为空")
    private BigDecimal giftOriginalPrice;
}
