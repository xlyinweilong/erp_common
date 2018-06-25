package com.yin.erp.common.block.controller;

import com.yin.erp.common.base.controller.BaseController;
import com.yin.erp.common.base.entity.po.BaseVo;
import com.yin.erp.common.block.entity.po.BlockPo;
import com.yin.erp.common.block.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author yin.weilong
 * @date 2018.06.21
 */
@RestController
@RequestMapping("/block")
public class BlockController extends BaseController<BlockPo, BlockService, String> {

    @PostConstruct
    public void init() {
    }

    @Autowired
    private BlockService blockService;

}
