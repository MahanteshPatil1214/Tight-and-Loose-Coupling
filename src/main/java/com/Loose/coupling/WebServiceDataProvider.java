package com.Loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {


    @Override
    public String getUserDetails() {
        return "Fetching Data from Webservice";
    }
}
