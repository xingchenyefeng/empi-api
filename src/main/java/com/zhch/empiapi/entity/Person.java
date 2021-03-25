package com.zhch.empiapi.entity;


import com.zhch.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p>
 * 人员基本信息
 * </p>
 *
 * @author luoxiaoming
 * @since 2021-03-24
 */
@Getter
@Setter
@ApiModel("人员基本信息")
public class Person extends Entity {

    private static final long serialVersionUID = 4240276163300419368L;


    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idNo;


    /**
     * 身份证件类别代码
     */
    @ApiModelProperty("身份证件类别代码")
    private String idCategoryCode;


    /**
     * 患者姓名
     */
    @ApiModelProperty("患者姓名")
    private String name;


    /**
     * 出生日期
     */
    @ApiModelProperty("出生日期")
    private Date birthTime;


    /**
     * 性别代码
     */
    @ApiModelProperty("性别代码")
    private String genderCode;


    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String genderName;


    /**
     * 婚姻状况代码
     */
    @ApiModelProperty("婚姻状况代码")
    private String maritalStatusCode;


    /**
     * 婚姻状况
     */
    @ApiModelProperty("婚姻状况")
    private String maritalStatusName;


    /**
     * 国籍代码
     */
    @ApiModelProperty("国籍代码")
    private String nationalityCode;


    /**
     * 国籍
     */
    @ApiModelProperty("国籍")
    private String nationalityName;


    /**
     * 民族代码
     */
    @ApiModelProperty("民族代码")
    private String ethnicGroupCode;


    /**
     * 民族
     */
    @ApiModelProperty("民族")
    private String ethnicGroupName;


    /**
     * 职业类别代码
     */
    @ApiModelProperty("职业类别代码")
    private String occupationCode;


    /**
     * 职业类别
     */
    @ApiModelProperty("职业类别")
    private String occupationName;


    /**
     * 工作单位名称
     */
    @ApiModelProperty("工作单位名称")
    private String employerOrganizationName;


    /**
     * 工作单位电话号码
     */
    @ApiModelProperty("工作单位电话号码")
    private String employerOrganizationContactPhone;


    /**
     * 患者电话号码
     */
    @ApiModelProperty("患者电话号码")
    private String phone;


    /**
     * 电子邮件
     */
    @ApiModelProperty("电子邮件")
    private String email;


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
    public static final String TBL_ID_NO = "id_no";
    public static final String TBL_ID_CATEGORY_CODE = "id_category_code";
    public static final String TBL_NAME = "name";
    public static final String TBL_BIRTH_TIME = "birth_time";
    public static final String TBL_GENDER_CODE = "gender_code";
    public static final String TBL_GENDER_NAME = "gender_name";
    public static final String TBL_MARITAL_STATUS_CODE = "marital_status_code";
    public static final String TBL_MARITAL_STATUS_NAME = "marital_status_name";
    public static final String TBL_NATIONALITY_CODE = "nationality_code";
    public static final String TBL_NATIONALITY_NAME = "nationality_name";
    public static final String TBL_ETHNIC_GROUP_CODE = "ethnic_group_code";
    public static final String TBL_ETHNIC_GROUP_NAME = "ethnic_group_name";
    public static final String TBL_OCCUPATION_CODE = "occupation_code";
    public static final String TBL_OCCUPATION_NAME = "occupation_name";
    public static final String TBL_EMPLOYER_ORGANIZATION_NAME = "employer_organization_name";
    public static final String TBL_EMPLOYER_ORGANIZATION_CONTACT_PHONE = "employer_organization_contact_phone";
    public static final String TBL_PHONE = "phone";
    public static final String TBL_EMAIL = "email";
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
