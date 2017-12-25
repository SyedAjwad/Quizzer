package com.example.aj.test_quizzer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Quiz_creation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_creation); // Setting question creation activity (for creating questions) as the view for this java file
    }

    public void create_ques(View v) { // If create quiz button is pressed
        // Getting the texts of all the fields
        AutoCompleteTextView title_view = (AutoCompleteTextView) findViewById(R.id.title1);
        AutoCompleteTextView desc_view = (AutoCompleteTextView) findViewById(R.id.description);
        AutoCompleteTextView num_ques_view = (AutoCompleteTextView) findViewById(R.id.num_questions);
        String title = title_view.getText().toString();
        String description = desc_view.getText().toString();
        String num_ques_str = num_ques_view.getText().toString();
        if (!(title.isEmpty()) && !(description.isEmpty()) && Integer.parseInt(num_ques_str) > 0) { // Checking if the fields are empty or not
            Intent pass_num_ques = new Intent( Quiz_creation.this, Question_creation.class); // Creating an intent to pass number of questions
            pass_num_ques.putExtra("num_ques",num_ques_str); // Storing the total number of questions in the intent
            startActivity(pass_num_ques); // Opening Question Creation View for teachers along with passing the intent
            Context context = getApplicationContext();
            CharSequence text = "Quiz Created Succesfully";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show(); // Showing the user that the quiz has been created successfully
            this.finish(); // Finishing the current activity
        }
        else { // If any of the information field is empty showing the user that he has provided incorrect information
            Context context = getApplicationContext();
            CharSequence text = "Incorrect Information Provided";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
