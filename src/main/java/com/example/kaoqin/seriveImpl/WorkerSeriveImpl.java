package com.example.kaoqin.seriveImpl;

import com.example.kaoqin.dao.WorkerDao;
import com.example.kaoqin.model.Worker;
import com.example.kaoqin.serive.WorkerSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerSeriveImpl implements WorkerSerive {
    @Autowired
    WorkerDao workerDao;
    @Override
    public Worker findonlyname(String username) {
        return workerDao.selectnamenobody(username);
    }

    @Override
    public void insertuser(Worker worker) {
        workerDao.insertWorker(worker);
    }

    @Override
    public Worker loginuser(Worker worker) {
        return workerDao.logining(worker);
    }

    @Override
    public Worker findperson(Integer number) {
        return workerDao.findpersoninfo(number);
    }

}
