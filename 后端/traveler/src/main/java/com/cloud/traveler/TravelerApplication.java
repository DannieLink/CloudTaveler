package com.cloud.traveler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(value = "com.cloud.traveler.dao")
public class TravelerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelerApplication.class, args);
    }

}
