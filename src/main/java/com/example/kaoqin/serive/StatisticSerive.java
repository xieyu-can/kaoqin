package com.example.kaoqin.serive;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.kaoqin.model.Statistic;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public interface StatisticSerive extends IService<Statistic> {
    List<Statistic> findjilu(Integer worker_number);
}
