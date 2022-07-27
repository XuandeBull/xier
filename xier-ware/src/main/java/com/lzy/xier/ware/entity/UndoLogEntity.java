package com.lzy.xier.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author XuandeBull XuandeBull@gmail.com
 * @since 1.0.0 2022-07-27
 */
@Data
@TableName("undo_log")
public class UndoLogEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long branchId;
    /**
     * 
     */
	private String xid;
    /**
     * 
     */
	private String context;
    /**
     * 
     */
	private Byte rollbackInfo;
    /**
     * 
     */
	private Integer logStatus;
    /**
     * 
     */
	private Date logCreated;
    /**
     * 
     */
	private Date logModified;
    /**
     * 
     */
	private String ext;
}