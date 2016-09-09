package com.flyeyes.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: FlyEyesApplication
 * Description:
 *
 * @author kang.wang03
 *         Date 16/9/9
 */
@SpringBootApplication(scanBasePackages = "com.flyeyes.server")
public class FlyEyesApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(FlyEyesApplication.class, args);
    }
}
