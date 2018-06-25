package com.yin.erp.common.block.service;


import com.yin.erp.common.base.service.BaseService;
import com.yin.erp.common.block.entity.po.BlockPo;
import com.yin.erp.common.block.respositroy.BlockRepository;
import com.yin.erp.common.datasource.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.annotation.PostConstruct;


/**
 * 块-服务
 *
 * @author yin.weilong
 * @date 2018.06.23
 */
@Service
public class BlockService extends BaseService<BlockPo, BlockRepository, String> {

    @Autowired
    private BlockRepository blockRepository;


}
