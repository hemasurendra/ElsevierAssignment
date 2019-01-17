package Utils;

import java.util.ResourceBundle;

/**
 * Created by Siva on 1/15/2019.
 */

public class GetTestProperties {
    /**
     * This method returns the input values provided in config value
     * @param propName
     * @return the properties
     */
    public String getValue(String propName){
        ResourceBundle properties =ResourceBundle.getBundle("config");
       return properties.getString(propName);
    }
}
