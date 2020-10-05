package net.nh;

import io.dropwizard.Configuration;

public class AppConfig extends Configuration {

    private String dbName;

    public String getDbName() {
        return dbName;
    }
}