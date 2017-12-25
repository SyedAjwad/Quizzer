package com.example.aj.test_quizzer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class Teacher_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login); // Setting Teacher Login activity as the view for this java file
    }

    public void auth_signin(View v) { // If sign in button is pressed
        // Getting the texts of all the fields
        AutoCompleteTextView username_view = findViewById(R.id.userName);
        EditText pass_view = findViewById(R.id.password);
        String user_name = username_view.getText().toString();
        String password = pass_view.getText().toString();
        if (!(user_name.isEmpty()) && !(password.isEmpty())) { // Checking if the fields are empty or not
            startActivity(new Intent(Teacher_Login.this, Quiz_creation.class)); // Opening Quiz Creation View for teachers
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

    public void sign_up(View v) // If sign up button is clicked/touched
    {
        startActivity(new Intent(Teacher_Login.this, Sign_up.class)); // Opening sign up page for them
        this.finish(); // Finishing the current activity
    }
}
