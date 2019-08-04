package com.zdd;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@EnableDubbo(scanBasePackages = "com.zdd.dubbo.controller")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
@ComponentScan(value = {"com.zdd.dubbo.controller"})
public class SpringbootDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }
}
