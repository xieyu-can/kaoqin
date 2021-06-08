package com.example.kaoqin.controller;

import com.example.kaoqin.model.Worker;
import com.example.kaoqin.seriveImpl.WorkerSeriveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class WorkerController {
    @Autowired
    WorkerSeriveImpl workerSerive;
    @PostMapping("/registering")
    public String insertuser(Worker worker)
    {
        workerSerive.insertuser(worker);
        return "login";
    }
    @RequestMapping("/logining")
    public ModelAndView login(Worker worker, HttpServletRequest request, HttpSession session, Model model)
    {
        ModelAndView modelAndView=new ModelAndView();
        String name=request.getParameter("username");
        String pd=request.getParameter("password");
        worker.setUsername(name);
        worker.setPassword(pd);
        worker=workerSerive.loginuser(worker);
        if(worker!=null)
        {
            session.setAttribute("worker",worker);
            modelAndView.setViewName("ref");
            String usernamen=worker.getUsername();
            model.addAttribute("name",usernamen);
            return modelAndView;
        }
        else{
            session.setAttribute("error","账号或者密码错误");
        }
        modelAndView.setViewName("login");
        return modelAndView;
    }
    @RequestMapping("/findpersoninfo")
    public String findpersoninfo(HttpSession session,Model model)
    {
        Worker worker = (Worker) session.getAttribute("worker");
        Integer id=worker.getNumber();
        Worker abc=workerSerive.findperson(id);
        model.addAttribute("person",abc);
        return "personinfo";
    }
}
