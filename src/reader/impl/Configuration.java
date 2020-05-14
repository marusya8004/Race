package reader.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static final String RESOURCES_PATH = "src\\resources\\";
    private static Properties properties;

    public static void readProperties() {
        if (properties == null) {
            properties = new Properties();
        }
        try {
            properties.load(new FileReader(new File(RESOURCES_PATH, "config.properties")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getPlayer() {
        initializeProperties();
        return properties.getProperty("player");
    }

    public static String getEnemy() {
        initializeProperties();
        return properties.getProperty("enemy");
    }

    private static void initializeProperties() {
        if (properties == null) {
            readProperties();
        }
    }
}
