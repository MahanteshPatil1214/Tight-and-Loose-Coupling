package com.ioc.coupling.coupling;

public class UserDataBaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User Details From Database";
    }
}
