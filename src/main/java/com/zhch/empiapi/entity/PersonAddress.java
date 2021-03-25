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
 * 人员基本信息-地址信息
 * </p>
 *
 * @author luoxiaoming
 * @since 2021-03-24
 */
@Getter
@Setter
@ApiModel("人员基本信息-地址信息")
@TableName("person_address")
public class PersonAddress extends Entity {

    private static final long serialVersionUID = -4151270624047868734L;


    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idNo;


    /**
     * 地址类别代码 01	户籍住址,02	工作场所地址,03	家庭常住住址,04	通讯地址,05	暂住地址,06	出生地址,07	产后修养地址,08	变迁地址,09	现住址,99	其他地址,
     */
    @ApiModelProperty("地址类别代码 01	户籍住址,02	工作场所地址,03	家庭常住住址,04	通讯地址,05	暂住地址,06	出生地址,07	产后修养地址,08	变迁地址,09	现住址,99	其他地址,")
    private String addressTypeCode;


    /**
     * 完整地址
     */
    @ApiModelProperty("完整地址")
    private String addressLine;


    /**
     * 地址-省（自治区、直辖市）
     */
    @ApiModelProperty("地址-省（自治区、直辖市）")
    private String state;


    /**
     * 地址-市（地区、州）
     */
    @ApiModelProperty("地址-市（地区、州）")
    private String city;


    /**
     * 地址-县（区）
     */
    @ApiModelProperty("地址-县（区）")
    private String country;


    /**
     * 地址-乡（镇、街道办事处）
     */
    @ApiModelProperty("地址-乡（镇、街道办事处）")
    private String streetBase;


    /**
     * 地址-村（街、路、弄等）
     */
    @ApiModelProperty("地址-村（街、路、弄等）")
    private String street;


    /**
     * 地址-门牌号码
     */
    @ApiModelProperty("地址-门牌号码")
    private String houseNumber;


    /**
     * 邮政编码
     */
    @ApiModelProperty("邮政编码")
    private String zipCode;


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
    public static final String TBL_ADDRESS_TYPE_CODE = "address_type_code";
    public static final String TBL_ADDRESS_LINE = "address_line";
    public static final String TBL_STATE = "state";
    public static final String TBL_CITY = "city";
    public static final String TBL_COUNTRY = "country";
    public static final String TBL_STREET_BASE = "street_base";
    public static final String TBL_STREET = "street";
    public static final String TBL_HOUSE_NUMBER = "house_number";
    public static final String TBL_ZIP_CODE = "zip_code";
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
