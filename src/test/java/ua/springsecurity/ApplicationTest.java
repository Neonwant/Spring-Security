package ua.springsecurity;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;

import static org.junit.Assert.*;

public class ApplicationTest {
    @Test
    public void configureGlobal() throws Exception {
        String auth = "dXNlcjpwYXNzd29yZA==";
        System.out.println(new String(Base64.getDecoder().decode(auth)));

        System.out.println(new BCryptPasswordEncoder().encode("password"));
    }

}