package com.example.WidgetsAndListeners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abdihakimtask4.R;

public class MainActivity extends AppCompatActivity {
    public int moodSelected = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void LanguageSelected(View view){
        final TextView results = (TextView) findViewById(R.id.results);
        final CheckBox java = (CheckBox) findViewById(R.id.java);
        final CheckBox kotlin = (CheckBox) findViewById(R.id.kotlin);

        if (java.isChecked() && kotlin.isChecked())
        {
            results.setText("I selected both Android - Java and Android - Kotlin.");
        }
        else if (java.isChecked())
        {
            results.setText("I selected Android - Java.");
        }
        else if (kotlin.isChecked())
        {
            results.setText("I selected Android - Kotlin.");
        }
        else {
            results.setText("");
        }
    }
    public void SelectMood(View view)
    {
        final RadioButton happy = (RadioButton) findViewById(R.id.happy);
        final RadioButton okay = (RadioButton) findViewById(R.id.okay);
        final ImageView img = (ImageView) findViewById(R.id.mood);
        if (happy.isChecked())
        {
            img.setImageResource(R.drawable.happy);
            moodSelected = 1;
        }
        else if (okay.isChecked())
        {
            img.setImageResource(R.drawable.okay);
            moodSelected = 2;
        }
        else
        {
            img.setImageResource(R.drawable.sad);
            moodSelected = 3;
        }
    }
    public void ShowSelect(View view){
        final TextView results = (TextView) findViewById(R.id.results);
        String result = results.getText().toString();
        if (moodSelected == 1)
        {
            result = "I am Happy and " + result;
        }
        else if (moodSelected == 2)
        {
            result = "I am Okay and " + result;
        }
        else if (moodSelected == 3)
        {
            result = "I am Sad and " + result;
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}