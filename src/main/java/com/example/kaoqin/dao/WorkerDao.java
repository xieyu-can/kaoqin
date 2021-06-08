package com.example.kaoqin.dao;

import com.example.kaoqin.model.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkerDao {
    void insertWorker(Worker worker);
    Worker logining(Worker worker);
    Worker selectnamenobody(@Param("username")String username);
    Worker findpersoninfo(@Param("number") Integer number);
}
