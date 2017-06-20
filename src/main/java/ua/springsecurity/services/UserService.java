package ua.springsecurity.services;

import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.springsecurity.domain.Role;
import ua.springsecurity.domain.User;
import ua.springsecurity.persistence.UserDao;

import javax.annotation.PostConstruct;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @PostConstruct
    public void init() {

//        userDao.findByUserName("user").ifPresent(user -> {
//            //user.setPassword(new BCryptPasswordEncoder().encode("password"));
//            userDao.save(user);
//        });

//        if (!userDao.findByUserName("user").isPresent()) {
//            userDao.save(User.builder()
//                .username("user")
//                .password(new BCryptPasswordEncoder().encode("password"))
//                .authorities(ImmutableList.of(Role.USER))
//                .accountNonExpired(true)
//                .accountNonLocked(true)
//                .credentialsNonExpired(true)
//                .enabled(true)
//                .build()
//            );
//        }
//        if (!userDao.findByUserName("admin").isPresent()) {
//            userDao.save(User.builder()
//                    .username("admin")
//                    .password(new BCryptPasswordEncoder().encode("admin"))
//                    .authorities(ImmutableList.of(Role.ADMIN))
//                    .accountNonExpired(true)
//                    .accountNonLocked(true)
//                    .credentialsNonExpired(true)
//                    .enabled(true)
//                    .build()
//            );
//        }
//        if (!userDao.findByUserName("power").isPresent()) {
//            userDao.save(User.builder()
//                    .username("power")
//                    .password(new BCryptPasswordEncoder().encode("power"))
//                    .authorities(ImmutableList.of(Role.POWER_USER))
//                    .accountNonExpired(true)
//                    .accountNonLocked(true)
//                    .credentialsNonExpired(true)
//                    .enabled(true)
//                    .build()
//            );
//        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUserName(username).orElseThrow(() ->
                new UsernameNotFoundException("user" + username + " was not found!"));
    }
}