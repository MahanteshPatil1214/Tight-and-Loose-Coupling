package com.ioc.coupling.coupling;

public class WebServiceDataProvider implements UserDataProvider {


    @Override
    public String getUserDetails() {
        return "Fetching Data from Webservice";
    }
}
