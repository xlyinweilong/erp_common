package com.yin.erp.common.base.service;

import com.yin.erp.common.base.entity.vo.BasePo;
import com.yin.erp.common.base.respositroy.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

/**
 * 基本服务层
 *
 * @author yin.weilong
 * @date 2018.06.21
 */
public abstract class BaseService<T extends BasePo, R extends BaseRepository, ID> {

    @Autowired
    private R repository;

    /**
     * 查询所有排序
     *
     * @param sort
     * @return
     */
    public Iterable<T> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    /**
     * 查询所有分页
     *
     * @param p
     * @return
     */
    public Page<T> findAll(Pageable p) {
        return repository.findAll(p);
    }

    /**
     * 单个保存
     *
     * @param t
     * @return
     */
    public void save(T t) {
        repository.save(t);
    }

    /**
     * 批量保存
     *
     * @param s
     * @param <S>
     * @return
     */
    public <S extends T> Iterable<S> saveAll(Iterable<S> s) {
        return repository.saveAll(s);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    /**
     * 查询ID是否存在
     *
     * @param id
     * @return
     */
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    /**
     * 查询所有
     *
     * @return
     */
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    /**
     * 根据ID，批量查询
     *
     * @param t
     * @return
     */
    public Iterable<T> findAllById(Iterable<ID> t) {
        return repository.findAllById(t);
    }

    /**
     * 查询总数
     *
     * @return
     */
    public long count() {
        return repository.count();
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    /**
     * 单个删除
     *
     * @param t
     */
    public void delete(T t) {
        repository.delete(t);
    }

    /**
     * 批量删除
     *
     * @param t
     */
    public void deleteAll(Iterable<? extends T> t) {
        repository.deleteAll(t);
    }

    /**
     * 清空
     */
    public void deleteAll() {
        repository.deleteAll();
    }
}
