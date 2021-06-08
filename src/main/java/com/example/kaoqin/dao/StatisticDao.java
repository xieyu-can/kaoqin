package com.example.kaoqin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.kaoqin.model.Statistic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StatisticDao extends BaseMapper<Statistic> {
    List<Statistic> findrecord(@Param("worker_number") Integer worker_number);
}
