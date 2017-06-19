package ua.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
//@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Application {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("password"));
    }

}
