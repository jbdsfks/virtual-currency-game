package com.lzj.vcg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VcgApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(VcgApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(VcgApplication.class, args);
        LOGGER.info("项目启动");
    }

}
