package com.example.android.sportsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.example.android.sportsquiz.R.id.editText3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toInfoPage(View view) {
        Intent intent = new Intent(this, InfoPage.class);
        EditText editText = (EditText) findViewById(editText3);
        String message = editText.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }

}
