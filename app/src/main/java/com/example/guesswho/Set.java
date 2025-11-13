package com.example.guesswho;

import static com.example.guesswho.MainActivity.*;

import android.os.Build;

import androidx.annotation.RequiresApi;

public class Set {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void questions() {
        for (int i = 0; i < basicQuestions.size(); i++) { // Loop through all the elements of the characters list
            Questions name = basicQuestions.get(i); // Get the i-th character from the list
            questions.add(name.value()); // Add the name of the character to the characterNames list
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void characters() {
        for (int i = 0; i < characters.size(); i++) { // Loop through all the elements of the characters list
            Characters name = characters.get(i); // Get the i-th character from the list
            characterNames.add(name.value()); // Add the name of the character to the characterNames list
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void arms() {
        arms.add(Characters.AL.value());
        arms.add(Characters.ERIC.value());
        arms.add(Characters.TIMMY.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void legs() {
        legs.add(Characters.AL.value());
        legs.add(Characters.ERIC.value());
        legs.add(Characters.TIMMY.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void nose() {
        nose.add(Characters.BUD.value());
        nose.add(Characters.GREG.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void eyes() {
        eyes.add(Characters.BUD.value());
        eyes.add(Characters.CHUCK.value());
        eyes.add(Characters.GREG.value());
        eyes.add(Characters.JAY.value());
        eyes.add(Characters.TIMMY.value());
        eyes.add(Characters.TYSON.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void mouth() {
        mouth.add(Characters.BUD.value());
        mouth.add(Characters.GREG.value());
        mouth.add(Characters.JAY.value());
        mouth.add(Characters.TYSON.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void cubeFace() {
        cubeFace.add(Characters.BUD.value());
        cubeFace.add(Characters.ERIC.value());
        cubeFace.add(Characters.TYSON.value());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void oneEye() {
        oneEye.add(Characters.ERIC.value());
    }
}
