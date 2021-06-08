package com.example.kaoqin.serive;

import com.example.kaoqin.model.Worker;
import org.springframework.stereotype.Service;

@Service
public interface WorkerSerive {
    Worker findonlyname(String username);
    void insertuser(Worker worker);
    Worker loginuser(Worker worker);
    Worker findperson(Integer number);
}
