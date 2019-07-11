//package com.didispace;
//
//
//import com.didispace.bean.TestConfig;
//import org.springframework.boot.bind.RelaxedPropertyResolver;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//
////import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
////@EnableTransactionManagement
//public class DataBaseConfiguration implements EnvironmentAware {
//
//    private RelaxedPropertyResolver propertyResolver;
//
//    @Override
//    public void setEnvironment(Environment env) {
//        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
//    }
//
//    @Bean
//    public String  writeDataSource() {
//
//        TestConfig datasource = new TestConfig();
//        datasource.setUsername(propertyResolver.getProperty("url"));
//        System.out.println(propertyResolver.getProperty("url"));
//        return propertyResolver.getProperty("url");
//
//    }
//}