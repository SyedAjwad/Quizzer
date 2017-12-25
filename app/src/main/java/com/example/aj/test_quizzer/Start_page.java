package com.example.aj.test_quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Start_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page); // Setting Start Page activity as the view for this java file
    }

    public void next(View v)
    {
        RadioButton teacher = findViewById(R.id.teacher);
        RadioButton student = findViewById(R.id.student);
        if (teacher.isChecked()) { // If the person is a Teacher
            startActivity(new Intent(Start_page.this, Teacher_Login.class)); // Opening Teacher Login page for him
            this.finish(); // Finishing the current activity
        } else if (student.isChecked()) { // If the person is a student
            startActivity(new Intent(Start_page.this, Student_login.class)); // Opening Student Login page for him
            this.finish(); // Finishing the current activity
        }
    }
}
