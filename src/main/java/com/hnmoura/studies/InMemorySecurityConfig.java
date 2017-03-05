package com.hnmoura.studies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

/**
 * Created by hivisonmoura on 2017-03-05.
 */
@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder)
            throws Exception{
        builder
                .inMemoryAuthentication()
                .withUser("hivison").password("123").roles("USER")
                .and()
                .withUser("hmoura").password("123").roles("USER")
                .and()
                .withUser("hnm").password("123").roles("USER");
    }
}
