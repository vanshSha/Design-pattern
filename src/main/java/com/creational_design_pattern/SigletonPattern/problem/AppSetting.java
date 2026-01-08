package com.creational_design_pattern.SigletonPattern.problem;

import lombok.AllArgsConstructor;

public class AppSetting {

    private String dataBaseURL;

    private String APIKey;

    public AppSetting(){
        dataBaseURL = "jdbc:mysql://localhost:3306/mydatabase";
        APIKey = "12345-ABCDE";
    }

    public String getDataBaseUrl(){
        return dataBaseURL;
    }

    public String getAPIKey(){
        return APIKey;
    }
}
