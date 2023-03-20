package tobyspring.tobyspringboot;

import org.springframework.boot.SpringApplication;

import tobyspring.tobyspringboot.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }
}
