package com.immotors.modificationnotifiertestdemo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * SecurityFeignClient
 *
 * @author lilei
 * @date 6/25/24
 */
@FeignClient(path = "/security",name = "user")
public interface SecurityFeignClient {

    /**
     * test
     */
    @PostMapping("/add")
    void add();
}
