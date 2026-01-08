package com.creational_design_pattern.SigletonPattern.solution;

import com.creational_design_pattern.SigletonPattern.solution.AppSetting;

public class SingletonPattern {
    public static void main(String[] args) {
        AppSetting appSetting =  AppSetting.getInstance(); // change this code
        AppSetting appSettingCopy = AppSetting.getInstance();

        System.out.println(appSetting.getAPIKey());
        System.out.println(appSettingCopy.getAPIKey());

        System.out.println(appSetting == appSettingCopy);


    }
}
