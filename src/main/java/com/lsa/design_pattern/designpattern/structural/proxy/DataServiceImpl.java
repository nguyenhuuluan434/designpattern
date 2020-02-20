package com.lsa.design_pattern.designpattern.structural.proxy;

public class DataServiceImpl implements DataService {
    @Override
    public void delete() {
        System.out.println("Delete the value ...");
    }

    @Override
    public void read() {
        System.out.println("Read the value ...");
    }

    @Override
    public void update() {
        System.out.println("Update the value ...");
    }

    @Override
    public void write() {
        System.out.println("Write the value ...");
    }
}
