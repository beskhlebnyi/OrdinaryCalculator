package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Arrays;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        EditText ed = findViewById(R.id.history_field);
        Db db = new Db(this);



        ed.setText(db.selectCalculations());



    }




}
