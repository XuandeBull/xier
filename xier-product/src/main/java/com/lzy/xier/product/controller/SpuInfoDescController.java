package com.lzy.xier.product.controller;

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
import com.lzy.xier.product.dto.SpuInfoDescDTO;
import com.lzy.xier.product.excel.SpuInfoDescExcel;
import com.lzy.xier.product.service.SpuInfoDescService;
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
 * spu信息介绍
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-20
 */
@RestController
@RequestMapping("product/spuinfodesc")
@Api(tags="spu信息介绍")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("product:spuinfodesc:page")
    public Result<PageData<SpuInfoDescDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SpuInfoDescDTO> page = spuInfoDescService.page(params);

        return new Result<PageData<SpuInfoDescDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("product:spuinfodesc:info")
    public Result<SpuInfoDescDTO> get(@PathVariable("id") Long id){
        SpuInfoDescDTO data = spuInfoDescService.get(id);

        return new Result<SpuInfoDescDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("product:spuinfodesc:save")
    public Result save(@RequestBody SpuInfoDescDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        spuInfoDescService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("product:spuinfodesc:update")
    public Result update(@RequestBody SpuInfoDescDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        spuInfoDescService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("product:spuinfodesc:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        spuInfoDescService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("product:spuinfodesc:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SpuInfoDescDTO> list = spuInfoDescService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SpuInfoDescExcel.class);
    }

}