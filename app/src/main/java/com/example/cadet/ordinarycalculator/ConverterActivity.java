package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.List;
import java.util.ArrayList;

public class ConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        Boolean mTime, mWeight,mSpeed;


        Spinner type_spinner = findViewById(R.id.type_spinner);
        final Spinner v1_spinner = findViewById(R.id.first_value_spinner);
        final Spinner v2_spinner = findViewById(R.id.second_value_spinner);
        final EditText value1, value2;
        value1 = findViewById(R.id.start_value);
        value2 = findViewById(R.id.result);


        String[] time_values = getResources().getStringArray(R.array.time_array);
        String[] weight_values = getResources().getStringArray(R.array.weight_array);
        String[] speed_values = getResources().getStringArray(R.array.speed_array);


        final ArrayAdapter<String> time_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, time_values);
        time_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> weight_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, weight_values);
        weight_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<String> speed_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, speed_values);
        speed_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        type_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String[] choose = getResources().getStringArray(R.array.types_array);

                if (choose[position].equals("Time")){
                    v1_spinner.setAdapter(time_adapter);
                    v2_spinner.setAdapter(time_adapter);
                }

                if (choose[position].equals("Weight")){
                    v1_spinner.setAdapter(weight_adapter);
                    v2_spinner.setAdapter(weight_adapter);
                }

                if (choose[position].equals("Speed")){
                    v1_spinner.setAdapter(speed_adapter);
                    v2_spinner.setAdapter(speed_adapter);
                    }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
}
