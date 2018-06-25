package com.yin.erp.common.block.respositroy;


import com.yin.erp.common.base.respositroy.BaseRepository;
import com.yin.erp.common.block.entity.po.BlockPo;
import org.springframework.stereotype.Repository;

/**
 * 块-数据rest
 *
 * @author yin.weilong
 * @date 2018.06.23
 */
//@RepositoryRestResource(collectionResourceRel = "blockPo", path = "block")
@Repository
public interface BlockRepository extends BaseRepository<BlockPo, String> {
}
