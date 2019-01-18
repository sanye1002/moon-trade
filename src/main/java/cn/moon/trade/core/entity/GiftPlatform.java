package cn.moon.trade.core.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc 礼物平台
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GiftPlatform implements Serializable {
    private static final long serialVersionUID = 8904832632018250323L;
    @TableId
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
