package com.example.kaoqin.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("worker")
@Entity(name = "worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    private String gender;
    private String  age;
    private String  department;
    private String  password;
    private String  username;
}
