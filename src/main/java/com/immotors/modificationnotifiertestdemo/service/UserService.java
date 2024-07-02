package com.immotors.modificationnotifiertestdemo.service;

import com.immotors.modificationnotifiertestdemo.client.SecurityClient;
import com.immotors.modificationnotifiertestdemo.client.SecurityFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author lilei
 * @date 6/25/24
 */
@Service
public class UserService {

    @Autowired
    private SecurityClient securityClient;

    @Autowired
    private SecurityFeignClient feignClient;

    public void save() {
        securityClient.addRule();
    }


    public void add(){
        feignClient.add();

    }
}
