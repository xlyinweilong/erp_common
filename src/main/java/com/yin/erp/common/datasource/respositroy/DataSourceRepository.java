package com.yin.erp.common.datasource.respositroy;

import com.yin.erp.common.base.respositroy.BaseRepository;
import com.yin.erp.common.datasource.entity.po.DataSourcePo;
import org.springframework.stereotype.Repository;

/**
 * 数据源-数据仓
 *
 * @author yin.weilong
 * @date 2018.06.23
 */
@Repository
public interface DataSourceRepository extends BaseRepository<DataSourcePo, String> {
}
