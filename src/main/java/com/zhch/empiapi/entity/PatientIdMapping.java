package com.zhch.empiapi.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.zhch.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p>
 * 第三方系统和平台患者主索引对照
 * </p>
 *
 * @author luoxiaoming
 * @since 2021-03-24
 */
@Getter
@Setter
@ApiModel("第三方系统和平台患者主索引对照")
@TableName("patient_id_mapping")
public class PatientIdMapping extends Entity {

    private static final long serialVersionUID = 2350963327680051787L;


    /**
     * 患者id
     */
    @ApiModelProperty("患者id")
    private String patientId;


    /**
     * 城乡居民健康档案编号
     */
    @ApiModelProperty("城乡居民健康档案编号")
    private String terminalCode;


    /**
     * 患者id
     */
    @ApiModelProperty("患者id")
    private Long localPatientId;


    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idNo;


    /**
     * 记录时间/建档日期
     */
    @ApiModelProperty("记录时间/建档日期")
    private Date recordTime;


    /**
     * 记录人代码
     */
    @ApiModelProperty("记录人代码")
    private String recorderCode;


    /**
     * 记录人姓名
     */
    @ApiModelProperty("记录人姓名")
    private String recorderName;


    /**
     * 数据状态
     */
    @ApiModelProperty("数据状态")
    private String statusCode;


    /**
     * 数据来源
     */
    @ApiModelProperty("数据来源")
    private String dataSource;




    public static final String TBL_ID = "id";
    public static final String TBL_PATIENT_ID = "patient_id";
    public static final String TBL_TERMINAL_CODE = "terminal_code";
    public static final String TBL_LOCAL_PATIENT_ID = "local_patient_id";
    public static final String TBL_ID_NO = "id_no";
    public static final String TBL_RECORD_TIME = "record_time";
    public static final String TBL_RECORDER_CODE = "recorder_code";
    public static final String TBL_RECORDER_NAME = "recorder_name";
    public static final String TBL_STATUS_CODE = "status_code";
    public static final String TBL_DATA_SOURCE = "data_source";
    public static final String TBL_CREATOR = "creator";
    public static final String TBL_CREATED_AT = "created_at";
    public static final String TBL_UPDATER = "updater";
    public static final String TBL_UPDATED_AT = "updated_at";

    ///////////////////////////////////////////////////////
    //////////////  以下为不在表中的字段  ////////////////////
    ///////////////////////////////////////////////////////
}
