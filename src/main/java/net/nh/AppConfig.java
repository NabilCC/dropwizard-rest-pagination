package net.nh;

import io.dropwizard.Configuration;

public class AppConfig extends Configuration {

    private String appName;

    private String dbConnectionUri;

    private String dbName;

    public String getAppName() {
        return appName;
    }

    public String getDbConnectionUri() {
        return dbConnectionUri;
    }

    public String getDbName() {
        return dbName;
    }
}