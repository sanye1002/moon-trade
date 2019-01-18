package cn.moon.trade.core.dto.comm.giftPlatform;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@Data
public class UpdateGiftPlatformDTO {
    @NotBlank(message = "平台ID不能为空")
    private String platformId;
    /** 平台名称*/
    @NotBlank(message = "平台名称不能为空")
    private String platformName;
    /** 平台编号*/
    @NotBlank(message = "平台编号不能为空")
    private String platformIdentifier;
}
