package com.example.flowershop.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Configuration
public class AppSettings {
    private String setting1;
    private String setting2;


    public void setSetting1(String setting1) {
        this.setting1 = setting1;
    }

    public void setSetting2(String setting2) {
        this.setting2 = setting2;
    }

    @Override
    public String toString() {
        return "setting 1: " + setting1 + " setting 2: " + setting2;
    }
}
