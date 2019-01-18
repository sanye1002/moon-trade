package cn.moon.trade.core.controller.system;

import cn.moon.trade.common.annotation.SysLogs;
import cn.moon.trade.common.bean.ResponseResult;
import cn.moon.trade.common.bean.ResponseCode;
import cn.moon.trade.core.dto.system.resource.ResourceDTO;
import cn.moon.trade.core.service.system.SysResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



/**
 * @author
 * @version 2018/4/22
 */
@RestController
@RequestMapping(value = "/system/resource")
@Api(tags = {"资源管理"})
public class ResourceController {

    @Autowired
    private SysResourceService resourceService;

    @PostMapping(value = {"/list"})
    @ApiOperation(value = "获取所有的资源列表")
    @SysLogs("获取所有的资源列表")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token")
    public ResponseResult list(){
        return ResponseResult.e(ResponseCode.OK,resourceService.list());
    }

    @PostMapping(value = {"/add"})
    @ApiOperation(value = "添加资源")
    @SysLogs("添加资源")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token")
    public ResponseResult add(@RequestBody @Validated @ApiParam("资源数据") ResourceDTO dto){
        resourceService.add(dto);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/update/{id}"})
    @ApiOperation(value = "添加资源")
    @SysLogs("添加资源")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token")
    public ResponseResult update(@PathVariable("id") @ApiParam("资源ID") String id,
                                 @RequestBody @Validated @ApiParam("资源数据") ResourceDTO dto){
        resourceService.update(id,dto);
        return ResponseResult.e(ResponseCode.OK);
    }

    @PostMapping(value = {"/remove/{id}"})
    @ApiOperation(value = "删除资源")
    @SysLogs("删除资源")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token")
    public ResponseResult remove(@PathVariable("id") @ApiParam("资源ID") String id){
        resourceService.remove(id);
        return ResponseResult.e(ResponseCode.OK);
    }


}
