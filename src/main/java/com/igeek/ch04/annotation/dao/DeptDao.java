package com.igeek.ch04.annotation.dao;

import org.springframework.stereotype.Repository;

//@Repository标注当前类是一个持久层，完成数据操作，添加至IOC容器中
@Repository
public class DeptDao implements IDao{

    public void select(){
        System.out.println("UserDao select()....");
    }

}
