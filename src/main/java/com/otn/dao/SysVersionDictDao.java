package com.otn.dao;

import com.otn.entity.SysVersionDict;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 版本字典Dao层
 */
@Repository
public interface SysVersionDictDao extends Mapper<SysVersionDict> {
}
