package com.example.kaoqin.seriveImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kaoqin.dao.StatisticDao;
import com.example.kaoqin.model.Statistic;
import com.example.kaoqin.serive.StatisticSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StatisticSeriveImpl extends ServiceImpl<StatisticDao, Statistic> implements StatisticSerive {
    @Resource
    StatisticDao statisticDao;
    @Override
    public List<Statistic> findjilu(Integer worker_number) {
        return statisticDao.findrecord(worker_number);
    }
}
