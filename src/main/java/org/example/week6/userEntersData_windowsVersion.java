package org.example.week6;

import java.awt.*;
import java.util.List;

import static input.InputUtils.stringInput;

public class userEntersData_windowsVersion {
    public static void main(String[] args) {
        java.util.List<String> windowsVersion= List.of("XP","7","8","10","11");
        String windowsVersionsStrings= String.join(",", windowsVersion);// will join "XP","7","8","10","11"

        String version= stringInput("Enter your version of Windows from "+ windowsVersionsStrings.toUpperCase());
        while (!windowsVersion.contains(version)){
            version = stringInput("Not a recognized version. "+ "Enter your Version of Windows from" +
                    "choices: " +windowsVersionsStrings.toUpperCase());
        }

        System.out.println("Than you for your windows version "+ version);

    }
}
