package com.yin.erp.common.datasynchronization.controller;

import com.yin.erp.common.base.controller.BaseController;
import com.yin.erp.common.datasynchronization.entity.po.DataSynchronizationPo;
import com.yin.erp.common.datasynchronization.service.DataSynchronizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 同步数据表-控制器
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
@RestController
@RequestMapping("/data_synchronization")
public class DataSynchronizationController extends BaseController<DataSynchronizationPo, DataSynchronizationService, String> {

    @Autowired
    private DataSynchronizationService dataSynchronizationService;

}
