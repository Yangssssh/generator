package cn.itcast.service.impl;

import cn.itcast.entity.Hello;
import cn.itcast.mapper.*;
import cn.itcast.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;

public class helloServiceimpl implements helloService {
    @Autowired
    private hellomapper hellomapper;


    @Override
    public Hello findById(String data) throws Exception {
        return hellomapper.findById(data);
    }
}

