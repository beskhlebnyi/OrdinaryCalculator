package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);



        EditText history_field;
        history_field = findViewById(R.id.history_field);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String calculations = extras.getString("calculations");

            history_field.setText( calculations);
            }
    }




}
