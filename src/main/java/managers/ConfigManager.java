package managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    public static Properties properties = new Properties();
    FileInputStream fip;

    public ConfigManager() {
        try {
            fip = new FileInputStream("AutomationBase//src//main//resources//config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
