package com.example.android.sportsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class InfoPage extends AppCompatActivity {

    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
        Intent intent = getIntent();
        name = intent.getStringExtra("message");
    }

    public void toSubmit(View v) {
        score = 0;

        RadioButton q1 =  findViewById(R.id.q1);
        RadioButton q2 = findViewById(R.id.q2);
        RadioButton q3 = findViewById(R.id.q3);
        RadioButton q4 =  findViewById(R.id.q4);
        CheckBox q5A = findViewById(R.id.q5A);
        CheckBox q5B =  findViewById(R.id.q5B);
        CheckBox q5C = findViewById(R.id.q5C);
        CheckBox q5D = findViewById(R.id.q5D);
        RadioButton q6 = findViewById(R.id.q6);
        RadioButton q7 =  findViewById(R.id.q7);
        RadioButton q8 = findViewById(R.id.q8);
        RadioButton q9 =  findViewById(R.id.q9);
        EditText q10 = findViewById(R.id.q10);
        String editText = q10.getText().toString().trim();
        Log.i("String", editText);
        String result;

        if (q1.isChecked())
            score += 1;
        if (q2.isChecked())
            score += 1;
        if (q3.isChecked())
            score += 1;
        if (q4.isChecked())
            score += 1;
        if (q5A.isChecked() && q5B.isChecked() && !q5C.isChecked() && !q5D.isChecked())
            score += 1;
        if (q6.isChecked())
            score += 1;
        if (q7.isChecked())
            score += 1;
        if (q8.isChecked())
            score += 1;
        if (q9.isChecked())
            score += 1;
        if (editText.equalsIgnoreCase("hockey"))
            score += 1;

        if (score == 10)
            result = "Awesome "+name+" !!\nYou scored 10";
        else if (score > 6)
            result = "Nice try "+name+" !\nYou scored " + score;
        else
            result = name +" You scored " + score + "\nTry harder next time";

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();

    }

    }
