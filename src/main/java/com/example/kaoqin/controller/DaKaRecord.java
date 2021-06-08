package com.example.kaoqin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.kaoqin.model.Statistic;
import com.example.kaoqin.model.Worker;
import com.example.kaoqin.serive.StatisticSerive;
import com.example.kaoqin.seriveImpl.StatisticSeriveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class DaKaRecord {
    @Autowired
    StatisticSerive statisticSerive;
    @Autowired
    StatisticSeriveImpl serive;

//    @RequestMapping("/dakejilu")
//    public String dakejilu(){
//        return "dakarecord";
//    }

    @RequestMapping("/dakejilu")
    public String table(Model model, HttpSession session, @RequestParam(value = "pn",defaultValue = "1")Integer pn)
    {
        Worker worker = (Worker) session.getAttribute("worker");
        Integer idid=worker.getNumber();
        List<Statistic> findjilu = serive.findjilu(idid);
        Page<Statistic> statisticPage=new Page<>(pn,5);
        Page<Statistic> page=statisticSerive.page(statisticPage,null);
        model.addAttribute("page",page);
        return "dakarecord";
    }
}
