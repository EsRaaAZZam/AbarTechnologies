package com.AbarTechnologies;

import com.AbarTechnologies.utilities.ConfigProperties;

import java.io.IOException;

public class User {
    private final String NT_ACCOUNT_CONFIG_PATH = "resources/config/nt-account.properties";
    private final String RATE_PLANES_CONFIG_PATH = "resources/config/config-rateplan.properties";
    private final String NT_USERNAME_KEY = "username";
    private final String NT_PASSWORD_KEY = "password";
    private final String msisdnKey;
    private final String passwordKey;
    private final ConfigProperties ratePlanesProperties;
    private final ConfigProperties ntAccountProperties;
    private String bundleID;

    public User(String msisdnKey, String passwordKey) throws IOException {
        this.msisdnKey = msisdnKey;
        this.passwordKey = passwordKey;

        ratePlanesProperties = new ConfigProperties(RATE_PLANES_CONFIG_PATH);
        ntAccountProperties = new ConfigProperties(NT_ACCOUNT_CONFIG_PATH);
    }

    public User(String msisdnKey, String passwordKey, String bundleID) throws IOException {
        this.msisdnKey = msisdnKey;
        this.passwordKey = passwordKey;
        this.bundleID = bundleID;
        ratePlanesProperties = new ConfigProperties(RATE_PLANES_CONFIG_PATH);
        ntAccountProperties = new ConfigProperties(NT_ACCOUNT_CONFIG_PATH);
    }


}
