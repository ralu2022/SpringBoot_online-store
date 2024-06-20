package com.example.flowershop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {


    @Bean(name = "defaultSettings")
    public AppSettings getAppSettings(){
        AppSettings appSettings = new AppSettings();
        appSettings.setSetting1("value1");
        appSettings.setSetting2("value2");
        return appSettings;
    }

}
