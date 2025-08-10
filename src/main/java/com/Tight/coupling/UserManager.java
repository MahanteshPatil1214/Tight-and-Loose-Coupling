package com.Tight.coupling;

public class UserManager {
    private static UserDataBase userDataBase = new UserDataBase();
    public static String getUserInfo(){
        return userDataBase.getUserDetails();

    }

}
