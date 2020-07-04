package proj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import proj.nativeinterface.test.HelloSpring;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringWithJNI {
    final static Logger log = LoggerFactory.getLogger(SpringWithJNI.class);

    public static void main(String[] args) {
        HelloSpring hs = new HelloSpring();
        log.info(hs.print());

        SpringApplication.run(SpringWithJNI.class, args);
    }
}
