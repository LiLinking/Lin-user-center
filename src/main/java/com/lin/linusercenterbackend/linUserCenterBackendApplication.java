package com.lin.linusercenterbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.linusercenterbackend.mapper")
public class linUserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(linUserCenterBackendApplication.class, args);
    }

}
