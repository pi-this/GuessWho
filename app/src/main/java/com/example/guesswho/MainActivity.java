package com.example.guesswho;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity {

    TextView text;
    public static List<String> arms = new ArrayList<>();
    public static List<String> legs = new ArrayList<>();
    public static List<String> eyes = new ArrayList<>();
    public static List<String> mouth = new ArrayList<>();
    public static List<String> nose = new ArrayList<>();
    public static List<String> cubeFace = new ArrayList<>();
    public static List<String> oneEye = new ArrayList<>();

    public static List<String> characterNames = new ArrayList<>(); // Create a list of strings to store the character names

    // Create a list of enum values using the values() method
    public static List<Characters> characters = Arrays.asList(Characters.values());


    public static List<String> questions = new ArrayList<>(); // Create a list of strings to store the character names

    // Create a list of enum values using the values() method
    public static List<Questions> basicQuestions = Arrays.asList(Questions.values());

    String question;
    Object del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        Set.characters();
        Set.questions();
        Set.arms();
        Set.legs();
        Set.eyes();
        Set.mouth();
        Set.nose();
        Set.cubeFace();
        Set.oneEye();


        questionShuffle();


    }

    public void questionShuffle() {
        Collections.shuffle(questions);
        question = questions.get(0);

        text.setText(question.toString());
        questions.remove(question);
        text.setText(String.valueOf(question));
    }

    public void yes(View view) {
        questionSearch();
        characterNames.retainAll((Collection<?>) del);
        if (questions.size() != 1) {
            questionShuffle();
        }
        else {
            text.setText(characterNames.toString());
        }


    }

    public void no(View view) {
        questionSearch();
        characterNames.removeAll((Collection<?>) del);
        if (questions.size() != 1) {
            questionShuffle();
        }
        else {
            text.setText(characterNames.get(0).toString());
        }

    }

    public void questionSearch () {
        if (question.equals(Questions.ARMS.value())) {
            del = arms;
        }
        else if (question.equals(Questions.LEGS.value())) {
            del = legs;
        }
        else if (question.equals(Questions.CUBE_FACE.value())) {
            del = cubeFace;
        }
        else if (question.equals(Questions.EYES.value())) {
            del = eyes;
        }
        else if (question.equals(Questions.MOUTH.value())) {
            del = mouth;
        }
        else if (question.equals(Questions.NOSE.value())) {
            del = nose;
        }
        else if (question.equals(Questions.EYE.value())) {
            del = oneEye;
        }
    }
}