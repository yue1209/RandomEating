package com;

import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author liufenming <liu.fenming@chinaott.onaliyun.com>
 * @Date: 2020/5/15
 */

@SpringBootApplication(scanBasePackages = {"com.yue.*"})
@MapperScan({"com.yue.test.mapper.my*"})
@EnableScheduling
public class RandomApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(RandomApplication.class, args);
    }
}
