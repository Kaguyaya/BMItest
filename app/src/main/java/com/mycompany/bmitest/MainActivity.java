package com.mycompany.bmitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void alertmessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText Bmiweight = findViewById(R.id.Bmiweight);
        EditText Bmiheight = findViewById(R.id.Bmiheight);
        TextView textView = findViewById(R.id.textwidth);
        RadioGroup radioGroup = findViewById(R.id.Sexgroup);

        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(checkedRadioButtonId);


        if (Bmiweight.getText().toString() != null && Bmiheight.getText().toString() != null)
        {
            double stringweight = Integer.valueOf(Bmiweight.getText().toString());
            double stringheight = Integer.valueOf(Bmiheight.getText().toString());
            double bmi = stringweight / (stringheight * stringheight);
            String result;
        }


    }
}