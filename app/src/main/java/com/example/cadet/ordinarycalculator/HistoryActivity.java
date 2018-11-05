package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Db db = new Db(this);
        final ArrayAdapter<String> history_adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                db.selectCalculations().split(";"));


        ListView lv = findViewById(R.id.list_view);

        lv.setAdapter(history_adapter);

    }
}
