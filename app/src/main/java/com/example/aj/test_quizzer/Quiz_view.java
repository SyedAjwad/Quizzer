package com.example.aj.test_quizzer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Quiz_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_view); // Setting quiz view activity (for viewing available quizzes) as the view for this java file
        Spinner spinner = findViewById(R.id.av_quiz); // Creating a spinner in which available quizzes will be shown
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.quizzes, android.R.layout.simple_spinner_item); // Creating an adapter with the strings of the available quizzes
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter); // Showing the available quizzes in the spinner using the created adapter
    }

    public void open_ques(View v)
    {
        Spinner spinner = findViewById(R.id.av_quiz); // Creating a spinner to get which quiz was selected
        String sel_quiz = spinner.getSelectedItem().toString(); // Storing the selected quiz in a string
        String quiz1 = "Quiz 1";
        String quiz2 = "Quiz 2";
        String quiz3 = "Quiz 3";
        Context context = getApplicationContext();
        CharSequence text = sel_quiz;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        if(sel_quiz.equals(quiz1)) // If Quiz 1 was Selected
        {
            startActivity(new Intent(Quiz_view.this, Mcq_view.class)); // Opening Quiz Creation View for teachers
            this.finish(); // Finishing the current activity
        }
        else if(sel_quiz.equals(quiz2)) // If Quiz 2 was Selected
        {
            startActivity(new Intent(Quiz_view.this, tf_view.class)); // Opening Quiz Creation View for teachers
            this.finish(); // Finishing the current activity
        }
        else if(sel_quiz.equals(quiz3)) // If Quiz 3 was Selected
        {
            startActivity(new Intent(Quiz_view.this, Numeric_view.class)); // Opening Quiz Creation View for teachers
            this.finish(); // Finishing the current activity
        }
    }
}

