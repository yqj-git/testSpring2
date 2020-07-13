package com.igeek.ch04.annotation.dao;

public class EmpDao implements IDao {
    @Override
    public void select() {
        System.out.println("EmpDao select() ...");
    }
}
