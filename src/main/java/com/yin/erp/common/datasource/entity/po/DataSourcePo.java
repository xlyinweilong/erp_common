package com.yin.erp.common.datasource.entity.po;


import com.yin.erp.common.base.entity.vo.BasePo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 数据源-实体
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
@Entity
@Table(name = "b_data_source")
@Getter
@Setter
public class DataSourcePo extends BasePo {

    /**
     * 关联的块
     */
    @Column(name = "block_id")
    private String blockId;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 数据库地址
     */
    @Column(name = "db_url")
    private String dbUrl;
    /**
     * 数据库名称
     */
    @Column(name = "db_name")
    private String dbName;

    /**
     * 数据库密码
     */
    @Column(name = "db_password")
    private String dbPassword;

    /**
     * 数据库端口号
     */
    @Column(name = "db_port")
    private String dbPort;

    /**
     * 是否是基线
     */
    @Column(name = "baseline")
    private boolean baseline = false;

}
