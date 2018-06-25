package com.yin.erp.common.base.entity.vo;

import com.yin.erp.common.base.entity.po.BaseVo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yin.weilong
 * @date 2018.06.25
 */
@Getter
@Setter
public class PageVo extends BaseVo {

    private int pageNo = 1;

    private int pageSize = 10;
}
