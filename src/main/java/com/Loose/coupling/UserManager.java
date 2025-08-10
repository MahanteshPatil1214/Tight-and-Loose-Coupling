package com.Loose.coupling;

public class UserManager {

    private static UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public static String getUserInfo(){
        return userDataProvider.getUserDetails();

    }

}
