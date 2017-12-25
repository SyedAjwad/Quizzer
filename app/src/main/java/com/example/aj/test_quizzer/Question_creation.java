package com.example.aj.test_quizzer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Question_creation extends AppCompatActivity {

    int num_ques_rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_creation); // Setting question creation activity as the view for this java file
        Bundle bundle = getIntent().getExtras(); // Creating Bundle to get information passed by quiz creation view
        String num_ques_str = bundle.getString("num_ques");
        num_ques_rem = Integer.parseInt(num_ques_str);
    }

    public void mcqselect(View v)
    {
        AutoCompleteTextView opt1 = (AutoCompleteTextView) findViewById(R.id.option1);
        opt1.setVisibility(opt1.VISIBLE);
        AutoCompleteTextView opt2 = (AutoCompleteTextView) findViewById(R.id.option2);
        opt2.setVisibility(opt2.VISIBLE);
        AutoCompleteTextView opt3 = (AutoCompleteTextView) findViewById(R.id.option3);
        opt3.setVisibility(opt3.VISIBLE);
        AutoCompleteTextView opt4 = (AutoCompleteTextView) findViewById(R.id.option4);
        opt4.setVisibility(opt4.VISIBLE);
    }

    public void mcqdeselect(View v)
    {
        AutoCompleteTextView opt1 = (AutoCompleteTextView) findViewById(R.id.option1);
        opt1.setVisibility(opt1.GONE);
        AutoCompleteTextView opt2 = (AutoCompleteTextView) findViewById(R.id.option2);
        opt2.setVisibility(opt2.GONE);
        AutoCompleteTextView opt3 = (AutoCompleteTextView) findViewById(R.id.option3);
        opt3.setVisibility(opt3.GONE);
        AutoCompleteTextView opt4 = (AutoCompleteTextView) findViewById(R.id.option4);
        opt4.setVisibility(opt4.GONE);
    }

    public  void next_ques(View v) { // If create quiz button is pressed
        // Getting the texts of all the fields
        AutoCompleteTextView pos_view = (AutoCompleteTextView) findViewById(R.id.index);
        AutoCompleteTextView text_view = (AutoCompleteTextView) findViewById(R.id.text);
        String position = pos_view.getText().toString();
        String text = text_view.getText().toString();
        if (!(position.isEmpty()) && !(text.isEmpty())) { // Checking if the fields are empty or not
            if(num_ques_rem >0) {
                Intent pass_num_ques = new Intent( Question_creation.this, Question_creation.class); // Creating an intent to pass number of questions
                pass_num_ques.putExtra("num_ques",num_ques_rem-1); // Storing the total number of questions in the intent
                startActivity(pass_num_ques); // Opening Quiz Creation View for teachers along with passing the intent
                this.finish(); // Finishing the current activity
            }
            else if (num_ques_rem == 0)
            {
                /* Taking him back to Teacher's (his) home page after successful creation of all Questions and Quiz */
                startActivity(new Intent(Question_creation.this, Quiz_creation.class));
                this.finish(); // Finishing the current activity
            }
        }
        else { // If any of the information field is empty showing the user that he has provided incorrect information
            Context context = getApplicationContext();
            CharSequence chara = "Incorrect Information Provided";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, chara, duration);
            toast.show();
        }
    }
}

