package com.yin.erp.common.datasynchronization.service;


import com.yin.erp.common.base.service.BaseService;
import com.yin.erp.common.block.entity.po.BlockPo;
import com.yin.erp.common.block.respositroy.BlockRepository;
import com.yin.erp.common.datasynchronization.entity.po.DataSynchronizationPo;
import com.yin.erp.common.datasynchronization.respositroy.DataSynchronizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 数据同步-服务
 *
 * @author yin.weilong
 * @date 2018.06.23
 */
@Service
public class DataSynchronizationService extends BaseService<DataSynchronizationPo, DataSynchronizationRepository, String> {

    @Autowired
    private DataSynchronizationRepository dataSynchronizationRepository;


}
