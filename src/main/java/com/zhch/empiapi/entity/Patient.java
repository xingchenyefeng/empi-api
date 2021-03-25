package com.zhch.empiapi.entity;


import com.zhch.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p>
 * 患者主记录
 * </p>
 *
 * @author luoxiaoming
 * @since 2021-03-24
 */
@Getter
@Setter
@ApiModel("患者主记录")
public class Patient extends Entity {

    private static final long serialVersionUID = -605884580670373043L;


    /**
     * 患者id
     */
    @ApiModelProperty("患者id")
    private String patientId;


    /**
     * 城乡居民健康档案编号
     */
    @ApiModelProperty("城乡居民健康档案编号")
    private String profileId;


    /**
     * 健康卡卡号
     */
    @ApiModelProperty("健康卡卡号")
    private String healthCardNo;


    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idNo;


    /**
     * ABO血型代码
     */
    @ApiModelProperty("ABO血型代码")
    private String bloodTypeCode;


    /**
     * ABO血型
     */
    @ApiModelProperty("ABO血型")
    private String bloodTypeName;


    /**
     * Rh血型代码
     */
    @ApiModelProperty("Rh血型代码")
    private String rhBloodTypeCode;


    /**
     * Rh血型
     */
    @ApiModelProperty("Rh血型")
    private String rhBloodTypeName;


    /**
     * 建档医疗机构代码
     */
    @ApiModelProperty("建档医疗机构代码")
    private String createdOrgCode;


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
    public static final String TBL_PROFILE_ID = "profile_id";
    public static final String TBL_HEALTH_CARD_NO = "health_card_no";
    public static final String TBL_ID_NO = "id_no";
    public static final String TBL_BLOOD_TYPE_CODE = "blood_type_code";
    public static final String TBL_BLOOD_TYPE_NAME = "blood_type_name";
    public static final String TBL_RH_BLOOD_TYPE_CODE = "rh_blood_type_code";
    public static final String TBL_RH_BLOOD_TYPE_NAME = "rh_blood_type_name";
    public static final String TBL_CREATED_ORG_CODE = "created_org_code";
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
