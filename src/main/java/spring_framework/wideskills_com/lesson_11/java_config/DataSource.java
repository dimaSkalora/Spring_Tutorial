package spring_framework.wideskills_com.lesson_11.java_config;

import java.util.Properties;

public class DataSource {
    private Properties dbProperties;
    public Properties getDbProperties() {
        return dbProperties;
    }
    public void setDbProperties(Properties dbProperties) {
        this.dbProperties = dbProperties;
    }
}
