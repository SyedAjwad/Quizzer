package com.example.aj.test_quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Numeric_view extends AppCompatActivity {

    int num_ques_rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_view); // Setting numeric view activity (for attempting numeric questions) as the view for this java file
        int num_ques_rem = 0;
    }

    public void next_ques(View v)
    {
        if(num_ques_rem >0) {
            Intent pass_num_ques = new Intent( Numeric_view.this, Numeric_view.class); // Creating an intent to pass number of questions
            pass_num_ques.putExtra("num_ques",num_ques_rem-1); // Storing the total number of questions in the intent
            startActivity(pass_num_ques); // Opening Quiz Creation View for teachers along with passing the intent
            this.finish(); // Finishing the current activity
        }
        else if (num_ques_rem == 0)
        {
            /* Taking him back to Student's (his) home page after he has attempted the quiz */
            startActivity(new Intent(Numeric_view.this, Quiz_view.class));
            this.finish(); // Finishing the current activity
        }
    }
}
