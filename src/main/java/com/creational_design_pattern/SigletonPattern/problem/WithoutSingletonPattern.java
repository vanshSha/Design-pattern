package com.creational_design_pattern.SigletonPattern.problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {

        AppSetting appSetting = new AppSetting();
        AppSetting appSettingCopy = new AppSetting();

        System.out.println(appSetting.getAPIKey());
        System.out.println(appSettingCopy.getAPIKey());

        // more memory
        System.out.println(appSetting==appSettingCopy);

    }
}
