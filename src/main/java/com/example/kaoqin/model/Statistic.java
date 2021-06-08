package com.example.kaoqin.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("statistic")
@Entity(name = "statistic")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  number;
    private String  machine_number;
    private String  worker_number;
    private String  shijian;
    private String  cishu;

    @Override
    public String toString() {
        return "Statistic{" +
                "number='" + number + '\'' +
                ", machine_number='" + machine_number + '\'' +
                ", worker_number='" + worker_number + '\'' +
                ", shijian='" + shijian + '\'' +
                ", cishu='" + cishu + '\'' +
                '}';
    }
}
