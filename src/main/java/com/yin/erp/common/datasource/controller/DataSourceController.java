package com.yin.erp.common.datasource.controller;

import com.yin.erp.common.base.controller.BaseController;
import com.yin.erp.common.block.service.BlockService;
import com.yin.erp.common.datasource.entity.po.DataSourcePo;
import com.yin.erp.common.datasource.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据源-控制器
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
@RestController
@RequestMapping("/data_source")
public class DataSourceController extends BaseController<DataSourcePo, DataSourceService, String> {

    @Autowired
    private DataSourceService dataSourceService;

}
