package cn.edu.uestc.iaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.edu.uestc.iaa.ActionController"})
public class SpiderApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpiderApplication.class, args);
    }
}
