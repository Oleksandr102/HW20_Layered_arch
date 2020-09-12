package com.example.demo;

import com.example.demo.dao.MagicData;
import com.example.demo.services.Service;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    private Service service;
    private MagicData data;
    private int memosize = 8;

    public Executor(Service service, MagicData data) {
        this.service = service;
        this.data = data;
    }

    public void start() {
        data.addNoteData();
        System.out.println("Laptop list:" + "\n");
        service.printAll();
        System.out.println("Laptops by make:" + "\n");
        service.printByMake("make");
        System.out.println("Laptops with RAM 8+" + "\n");
        service.printByMemoSize(memosize);
        System.out.println("Used laptops" + "\n");
        service.printUsed(true);
        exit();
    }

    public void exit(){
        System.exit(0);
    }
}
