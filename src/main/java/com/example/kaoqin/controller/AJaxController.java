package com.example.kaoqin.controller;

import com.example.kaoqin.dao.WorkerDao;
import com.example.kaoqin.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AJaxController {
    @Autowired
    WorkerDao workerDao;
    @PostMapping("/cancan")
    @ResponseBody
    public String can(String username){
        String mag="";
        Worker worker = workerDao.selectnamenobody(username);
        if(worker==null&&username!=null) {

            mag = "ok";
        }
        else{
            mag="用户名已经重复请重新输入用户名";
        }
        return mag;
    }


}
