package helper;

import java.util.Random;

/**
 * Created by Siva on 1/15/2019.
 */
public class EmailHelper {

    /**
     * This method is to generate Random String
     * @return
     */
    public String generateRandomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedRandomString = buffer.toString();

        return generatedRandomString;
    }

    /**
     * This method is to generate Random Email
     * @return
     */
    public String generateRandomEmail(){
        Random random = new Random();
        String randomEmail=generateRandomString()+random.nextInt(10000)+"@tryit.com";
        return randomEmail;
    }
}
