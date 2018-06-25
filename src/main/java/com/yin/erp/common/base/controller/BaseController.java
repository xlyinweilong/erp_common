package com.yin.erp.common.base.controller;

import com.yin.erp.common.base.entity.BaseJson;
import com.yin.erp.common.base.entity.vo.BasePo;
import com.yin.erp.common.base.entity.vo.PageVo;
import com.yin.erp.common.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * 基本控制器
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
public abstract class BaseController<T extends BasePo, S extends BaseService, ID> {

    @Autowired(required = false)
    private S service;

    /**
     * 查询页面
     *
     * @return
     */
    @GetMapping(path = "/findAll")
    public BaseJson findAll(PageVo pageVo) {
        return BaseJson.success(service.findAll(PageRequest.of(pageVo.getPageNo() - 1, pageVo.getPageSize(), Sort.Direction.DESC, "createDate")));
    }

    /**
     * 查询某个
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/findById")
    public BaseJson findById(ID id) {
        return BaseJson.success(service.findById(id));
    }

    /**
     * 增加数据
     *
     * @param t
     * @return
     */
    @PostMapping(path = "/insert")
    public BaseJson insert(@RequestBody T t) {
        service.save(t);
        return BaseJson.success();
    }

    /**
     * 修改数据
     *
     * @param t
     * @return
     */
    @PostMapping(path = "/update")
    public BaseJson update(@RequestBody T t) {
        service.save((T) service.findById(t.getId()).get());
        return BaseJson.success();
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    @PostMapping(path = "/delete")
    public BaseJson delete(ID id) {
        service.deleteById(id);
        return BaseJson.success();
    }

}
