package cn.moon.trade.core.controller.system;

import cn.moon.trade.common.annotation.SysLogs;
import cn.moon.trade.common.bean.ResponseCode;
import cn.moon.trade.common.bean.ResponseResult;
import cn.moon.trade.core.dto.comm.giftPlatform.AddGiftPlatformDTO;
import cn.moon.trade.core.dto.comm.giftPlatform.UpdateGiftPlatformDTO;
import cn.moon.trade.core.service.comm.GiftPlatformService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zhaoxiang
 * @Date 2019/01/17
 * @Desc
 */
@RestController
@RequestMapping(value = "/system/gift/platform")
@Api(tags = {"礼物平台管理"})
public class GiftPlatformController {
    @Autowired
    private GiftPlatformService service;

    @PostMapping(value = {"/add"})
    @ApiOperation(value = "添加礼物平台")
    @SysLogs("添加礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult add(@RequestBody @Validated @ApiParam("礼物平台数据") AddGiftPlatformDTO dto) {
        service.insertGiftPlatform(dto);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/update"})
    @ApiOperation(value = "更新礼物平台")
    @SysLogs("更新礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult update(@RequestBody @Validated @ApiParam("礼物平台数据") UpdateGiftPlatformDTO dto) {
        service.updateGiftPlatform(dto);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/delete"})
    @ApiOperation(value = "删除礼物平台")
    @SysLogs("删除礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult delete(@RequestBody @ApiParam("礼物平台ids") List<String> ids) {
        service.deleteGiftPlatformByIds(ids);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/select/page"})
    @ApiOperation(value = "分页查询礼物平台")
    @SysLogs("分页查询礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult select(@RequestParam(value = "page",defaultValue = "1") @ApiParam("页数") Integer page,
                                 @RequestParam(value = "size",defaultValue = "10") @ApiParam("个数") Integer size) {

        return ResponseResult.e(ResponseCode.OK, service.selectPageGiftPlatform(page, size));
    }
}
