package com.ittx.springcloud.controller;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "index")
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello,host:"+instance.getHost()+",Service_id:"+instance.getServiceId());
        return "Hello,World";
    }
}
