package cn.moon.trade.core.controller.system;

import cn.moon.trade.common.annotation.SysLogs;
import cn.moon.trade.common.bean.ResponseCode;
import cn.moon.trade.common.bean.ResponseResult;
import cn.moon.trade.core.dto.comm.giftInfo.AddGiftInfoDTO;
import cn.moon.trade.core.dto.comm.giftInfo.UpdateGiftInfoDTO;
import cn.moon.trade.core.service.comm.GiftInfoService;
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
@RequestMapping(value = "/system/gift/info")
@Api(tags = {"礼物信息管理"})
public class GiftInfoController {
    @Autowired
    private GiftInfoService service;

    @PostMapping(value = {"/add"})
    @ApiOperation(value = "添加礼物信息")
    @SysLogs("添加礼物信息")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult add(@RequestBody @Validated @ApiParam("添加礼物信息数据") AddGiftInfoDTO dto) {
        service.insertGiftInfo(dto);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/update"})
    @ApiOperation(value = "添加礼物信息")
    @SysLogs("添加礼物信息")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult update(@RequestBody @Validated @ApiParam("更新礼物信息数据") UpdateGiftInfoDTO dto) {
        service.updateGiftInfo(dto);
        return ResponseResult.e(ResponseCode.OK);
    }
    @PostMapping(value = {"/delete"})
    @ApiOperation(value = "删除礼物信息")
    @SysLogs("删除礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult delete(@RequestBody @ApiParam("礼物平台ids") List<String> ids) {
        service.deleteGiftInfoByIds(ids);
        return ResponseResult.e(ResponseCode.OK);
    }
    @PostMapping(value = {"/select/page"})
    @ApiOperation(value = "分页查询礼物信息")
    @SysLogs("分页查询礼物平台")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult select(@RequestParam(value = "page",defaultValue = "1") @ApiParam("页数") Integer page,
                                 @RequestParam(value = "size",defaultValue = "10") @ApiParam("个数") Integer size) {

        return ResponseResult.e(ResponseCode.OK, service.selectPageGiftInfo(page, size));
    }
    @PostMapping(value = {"/select/list"})
    @ApiOperation(value = "根据标号查询礼物信息")
    @SysLogs("根据标号查询礼物信息")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult list(@RequestParam(value = "platformIdentifier",required = true) @ApiParam("平台编号") String platformIdentifier) {
        return ResponseResult.e(ResponseCode.OK, service.selectListByPlatformIdentifier(platformIdentifier));
    }

}
