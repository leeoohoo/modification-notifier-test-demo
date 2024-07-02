package com.immotors.modificationnotifiertestdemo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * SecurityClient
 *
 * @author lilei
 * @date 6/25/24
 */
@Component
public class SecurityClient {

    @Autowired
    private RestTemplate restTemplate;


    /**
     * 根据 userId 查询用户
     * @ApiPath [{user, /user/query, GET}, {user, /user/commit}]
     * @return User
     */
    public void addRule(){
        restTemplate.postForEntity("http://localhost:8080/rules", null, String.class);
        restTemplate.exchange("http://localhost:8080/rules", HttpMethod.POST, new HttpEntity<String>(""), String.class);
    }

}
