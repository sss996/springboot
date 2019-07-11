package com.didispace.bean;//package com.didispace.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User{

    @Value("${database.userName}")
    private String userName;

    @Value("${database.password}")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("***** " + userName);
        this.userName = userName;
    }

    public String getPassword() {
        System.out.println("***** " + password);
        return password;
    }

    public void setPassword(String password) {
        System.out.println("***** " + password);
        this.password = password;
    }

    @Bean
    public String getUser(){

        System.out.println("***** " + userName);
        System.out.println("***** " + password);

        return userName +" ********* "+ password;
    }
}