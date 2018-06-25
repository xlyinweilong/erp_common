package com.yin.erp.common.datasynchronization.entity.po;


import com.yin.erp.common.base.entity.vo.BasePo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 同步数据表-实体
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
@Entity
@Table(name = "b_data_synchronization")
@Getter
@Setter
public class DataSynchronizationPo extends BasePo {


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
     * 表名称
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 所有列
     */
    @Column(name = "all_column")
    private boolean allColumn = false;

    /**
     * 同步的列，逗号分隔
     */
    @Column(name = "syn_column")
    private String synColumn;

}
