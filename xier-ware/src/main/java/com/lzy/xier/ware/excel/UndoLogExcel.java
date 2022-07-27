package com.lzy.xier.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
public class UndoLogExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "")
    private Long branchId;
    @Excel(name = "")
    private String xid;
    @Excel(name = "")
    private String context;
    @Excel(name = "")
    private Byte rollbackInfo;
    @Excel(name = "")
    private Integer logStatus;
    @Excel(name = "")
    private Date logCreated;
    @Excel(name = "")
    private Date logModified;
    @Excel(name = "")
    private String ext;

}