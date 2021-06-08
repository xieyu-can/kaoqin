package com.example.kaoqin.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("card_machine")
@Entity(name = "card_machine")
public class Card_Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    private String  location;
    private String  machine_type;
    private String  mathods;
}
