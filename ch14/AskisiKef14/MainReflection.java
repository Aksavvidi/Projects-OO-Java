package gr.aueb.cf.ch14.AskisiKef14;

import java.lang.reflect.Constructor;

public class MainReflection {
    public static void main(String[] args) {
        try {
            // Χρήση Reflection για την κλάση User
            Class<?> userClass = Class.forName("User");

            // Χρήση του constructor
            Constructor<?> constructor1 = userClass.getConstructor(String.class, String.class, String.class, String.class,String.class);
            Object user1 = constructor1.newInstance("Kathy", "Savvi", "5", "Kathy", "12345");

            // Χρήση Reflection για την κλάση UserCredentials
            Class<?> credentialsClass = Class.forName("UserCredentials");
            Constructor<?> credentialsConstructor = credentialsClass.getConstructor(String.class, String.class);
            Object credentials = credentialsConstructor.newInstance(Long.valueOf(23), "john_doe", "secretpassword");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}