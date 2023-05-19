package com.AbarTechnologies.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private final String configFilePath;
    private Properties properties;

    public ConfigProperties(String configFilePath) throws IOException {
        this.configFilePath = configFilePath;
        setConfigProperties();
    }

    private void setConfigProperties() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(configFilePath));
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void updateConfigFilePath() throws IOException {
        properties.store(new FileOutputStream(configFilePath), null);
    }
}
