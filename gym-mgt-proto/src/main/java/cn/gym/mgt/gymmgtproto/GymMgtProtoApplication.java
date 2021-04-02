package cn.gym.mgt.gymmgtproto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymMgtProtoApplication {
    private static Logger log = LoggerFactory.getLogger(GymMgtProtoApplication.class);

    public GymMgtProtoApplication() {

    }


    public static void main(String[] args) {
        SpringApplication.run(GymMgtProtoApplication.class, args);
    }
}
