package com.creational_design_pattern.SigletonPattern.solution;

public class AppSetting {

    // Step 1 : private static instance of the class
    private static AppSetting instance;

    private String dataBaseURL;

    private String APIKey;

    // Step 2 : Private constructor to prevent direct object creation
    private AppSetting(){
        dataBaseURL = "jdbc:mysql://localhost:3306/mydatabase";
        APIKey = "12345-ABCDE";
    }

    // I will provide method that can actually create object . if single object is not their then I will
    // create first object
    // Step 3 : Public static method to get the single instance
    public static AppSetting getInstance(){
        if(instance == null){
            instance = new AppSetting();
        }
        return instance;
    }

    public String getDataBaseUrl(){
        return dataBaseURL;
    }

    public String getAPIKey(){
        return APIKey;
    }
}
