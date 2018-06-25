package com.yin.erp.common.datasource.service;


import com.yin.erp.common.base.service.BaseService;
import com.yin.erp.common.block.entity.po.BlockPo;
import com.yin.erp.common.block.respositroy.BlockRepository;
import com.yin.erp.common.datasource.entity.po.DataSourcePo;
import com.yin.erp.common.datasource.respositroy.DataSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yin.weilong
 * @date 2018.06.23
 */
@Service
public class DataSourceService extends BaseService<DataSourcePo, DataSourceRepository, String> {

    @Autowired
    private DataSourceRepository dataSourceRepository;


}
