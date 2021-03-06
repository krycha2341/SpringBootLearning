package com.springboot.springbootapp.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);

        UserDetails user = userBuilder
                .username("krycha2341")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);

    }
}
