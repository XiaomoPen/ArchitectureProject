package com.seven.springboot.mapper.ly;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MaintainDao {
   void addMaintainDao();
}
