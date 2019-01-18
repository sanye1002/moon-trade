package cn.moon.trade.common.controller;

import cn.moon.trade.common.annotation.SysLogs;
import cn.moon.trade.common.bean.ResponseCode;
import cn.moon.trade.common.bean.ResponseResult;
import cn.moon.trade.common.service.BaseService;
import cn.moon.trade.common.service.CreateService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author moon
 * @version 2018/5/25/12:54
 */
public interface CreateController<AD,S extends CreateService<AD>> {

    S getService();

    @PostMapping("/add")
    @ApiOperation(value = "添加新增")
    @SysLogs("添加新增")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token",required = true)
    default ResponseResult add(@RequestBody @Validated AD a){
        getService().add(a);
        return ResponseResult.e(ResponseCode.OK);
    }
}
