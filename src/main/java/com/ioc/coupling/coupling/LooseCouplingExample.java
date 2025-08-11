package com.ioc.coupling.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {


        UserDataProvider databaseProvider = new UserDataBaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(UserManager.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(UserManager.getUserInfo());
    }
}
