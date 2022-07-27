package com.lzy.xier.ware.controller;

import com.lzy.xier.common.annotation.LogOperation;
import com.lzy.xier.common.constant.Constant;
import com.lzy.xier.common.page.PageData;
import com.lzy.xier.common.utils.ExcelUtils;
import com.lzy.xier.common.utils.Result;
import com.lzy.xier.common.validator.AssertUtils;
import com.lzy.xier.common.validator.ValidatorUtils;
import com.lzy.xier.common.validator.group.AddGroup;
import com.lzy.xier.common.validator.group.DefaultGroup;
import com.lzy.xier.common.validator.group.UpdateGroup;
import com.lzy.xier.ware.dto.WareInfoDTO;
import com.lzy.xier.ware.excel.WareInfoExcel;
import com.lzy.xier.ware.service.WareInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 仓库信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@RestController
@RequestMapping("ware/wareinfo")
@Api(tags="仓库信息")
public class WareInfoController {
    @Autowired
    private WareInfoService wareInfoService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("ware:wareinfo:page")
    public Result<PageData<WareInfoDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<WareInfoDTO> page = wareInfoService.page(params);

        return new Result<PageData<WareInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("ware:wareinfo:info")
    public Result<WareInfoDTO> get(@PathVariable("id") Long id){
        WareInfoDTO data = wareInfoService.get(id);

        return new Result<WareInfoDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("ware:wareinfo:save")
    public Result save(@RequestBody WareInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        wareInfoService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("ware:wareinfo:update")
    public Result update(@RequestBody WareInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        wareInfoService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("ware:wareinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        wareInfoService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("ware:wareinfo:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<WareInfoDTO> list = wareInfoService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, WareInfoExcel.class);
    }

}