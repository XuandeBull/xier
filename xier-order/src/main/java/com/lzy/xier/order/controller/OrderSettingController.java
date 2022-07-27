package com.lzy.xier.order.controller;

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
import com.lzy.xier.order.dto.OrderSettingDTO;
import com.lzy.xier.order.excel.OrderSettingExcel;
import com.lzy.xier.order.service.OrderSettingService;
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
 * 订单配置信息
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@RestController
@RequestMapping("order/ordersetting")
@Api(tags="订单配置信息")
public class OrderSettingController {
    @Autowired
    private OrderSettingService orderSettingService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("order:ordersetting:page")
    public Result<PageData<OrderSettingDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<OrderSettingDTO> page = orderSettingService.page(params);

        return new Result<PageData<OrderSettingDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("order:ordersetting:info")
    public Result<OrderSettingDTO> get(@PathVariable("id") Long id){
        OrderSettingDTO data = orderSettingService.get(id);

        return new Result<OrderSettingDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("order:ordersetting:save")
    public Result save(@RequestBody OrderSettingDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        orderSettingService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("order:ordersetting:update")
    public Result update(@RequestBody OrderSettingDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        orderSettingService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("order:ordersetting:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        orderSettingService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("order:ordersetting:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<OrderSettingDTO> list = orderSettingService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, OrderSettingExcel.class);
    }

}