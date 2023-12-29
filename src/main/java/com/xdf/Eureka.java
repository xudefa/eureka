package com.xdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 * @author xudefa
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka {

  public static void main(String[] args) {
    SpringApplication.run(Eureka.class, args);
  }
}
