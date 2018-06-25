package com.yin.erp.common.block.entity.po;


import com.yin.erp.common.base.entity.vo.BasePo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 块
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
@Entity
@Table(name = "b_block")
@Getter
@Setter
public class BlockPo extends BasePo {

    @Column(name = "name")
    private String name;

}
