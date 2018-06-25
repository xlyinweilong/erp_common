package com.yin.erp.common.datasynchronization.respositroy;


import com.yin.erp.common.base.respositroy.BaseRepository;
import com.yin.erp.common.datasynchronization.entity.po.DataSynchronizationPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * 同步数据表-数据仓
 *
 * @author yin.weilong
 * @date 2018.06.23
 */
//@RepositoryRestResource(collectionResourceRel = "dataSynchronizationPo", path = "data_synchronization")
@Repository
public interface DataSynchronizationRepository extends BaseRepository<DataSynchronizationPo, String> {
}
