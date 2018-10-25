package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
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



        final Spinner type_spinner = findViewById(R.id.type_spinner);
        final Spinner v1_spinner = findViewById(R.id.first_value_spinner);
        final Spinner v2_spinner = findViewById(R.id.second_value_spinner);
        final EditText value1, value2;
        final Button convert_button;

        convert_button = findViewById(R.id.convert_button);
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

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String result = extras.getString("result");
            value1.setText(result);
            //The key argument here must match that used in the other activity
        }
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



        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((!value1.getText().toString().equals(""))) {

                    float inputed = Float.parseFloat(value1.getText() + "");
                    switch (v1_spinner.getSelectedItem().toString()) {
                        case ("Second"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Second"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Minute"):
                                    value2.setText(inputed / 60 + "");
                                    break;
                                case ("Hour"):
                                    value2.setText(inputed / 3600 + "");
                                    break;
                                case ("Day"):
                                    value2.setText(inputed / 86400 + "");
                                    break;
                            }
                            break;

                        case ("Minute"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Second"):
                                    value2.setText(inputed * 60 + "");
                                    break;
                                case ("Minute"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Hour"):
                                    value2.setText(inputed / 60 + "");
                                    break;
                                case ("Day"):
                                    value2.setText(inputed / 1440 + "");
                                    break;
                            }
                            break;

                        case ("Hour"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Second"):
                                    value2.setText(inputed * 3600 + "");
                                    break;
                                case ("Minute"):
                                    value2.setText(inputed * 60 + "");
                                    break;
                                case ("Hour"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Day"):
                                    value2.setText(inputed * 24 + "");
                                    break;
                            }
                            break;

                        case ("Day"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Second"):
                                    value2.setText(inputed * 86400 + "");
                                    break;
                                case ("Minute"):
                                    value2.setText(inputed * 1440 + "");
                                    break;
                                case ("Hour"):
                                    value2.setText(inputed * 24 + "");
                                    break;
                                case ("Day"):
                                    value2.setText(inputed + "");
                                    break;
                            }
                            break;

                        case ("Ton"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Ton"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Kilogram"):
                                    value2.setText(inputed * 1000 + "");
                                    break;
                                case ("Gram"):
                                    value2.setText(inputed * 1000000 + "");
                                    break;
                                case ("Ounce"):
                                    value2.setText(inputed * 35273.962 + "");
                                    break;
                            }
                            break;

                        case ("Kilogram"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Ton"):
                                    value2.setText(inputed / 1000 + "");
                                    break;
                                case ("Kilogram"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Gram"):
                                    value2.setText(inputed * 1000 + "");
                                    break;
                                case ("Ounce"):
                                    value2.setText(inputed * 35.274 + "");
                                    break;
                            }
                            break;

                        case ("Gram"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Ton"):
                                    value2.setText(inputed / 1000000 + "");
                                    break;
                                case ("Kilogram"):
                                    value2.setText(inputed / 1000 + "");
                                    break;
                                case ("Gram"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("Ounce"):
                                    value2.setText(inputed / 28.35 + "");
                                    break;
                            }
                            break;

                        case ("Ounce"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("Ton"):
                                    value2.setText(inputed / 35273.962 + "");
                                    break;
                                case ("Kilogram"):
                                    value2.setText(inputed / 35.274 + "");
                                    break;
                                case ("Gram"):
                                    value2.setText(inputed * 28.35 + "");
                                    break;
                                case ("Ounce"):
                                    value2.setText(inputed + "");
                                    break;
                            }
                            break;

                        case ("m/s"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("m/s"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("km/h"):
                                    value2.setText(inputed * 3.6 + "");
                                    break;
                                case ("ml/h"):
                                    value2.setText(inputed * 2.237 + "");
                                    break;
                                case ("kn"):
                                    value2.setText(inputed * 1.944 + "");
                                    break;
                            }
                            break;

                        case ("km/h"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("m/s"):
                                    value2.setText(inputed / 3.6 + "");
                                    break;
                                case ("km/h"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("ml/h"):
                                    value2.setText(inputed / 1.609 + "");
                                    break;
                                case ("kn"):
                                    value2.setText(inputed / 1.852 + "");
                                    break;
                            }
                            break;

                        case ("ml/h"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("m/s"):
                                    value2.setText(inputed / 2.237 + "");
                                    break;
                                case ("km/h"):
                                    value2.setText(inputed * 1.609 + "");
                                    break;
                                case ("ml/h"):
                                    value2.setText(inputed + "");
                                    break;
                                case ("kn"):
                                    value2.setText(inputed / 1.151 + "");
                                    break;
                            }
                            break;

                        case ("kn"):
                            switch (v2_spinner.getSelectedItem().toString()) {
                                case ("m/s"):
                                    value2.setText(inputed / 2.237 + "");
                                    break;
                                case ("km/h"):
                                    value2.setText(inputed * 1.852 + "");
                                    break;
                                case ("ml/h"):
                                    value2.setText(inputed / 1.151 + "");
                                    break;
                                case ("kn"):
                                    value2.setText(inputed + "");
                                    break;
                            }
                            break;
                    }
                }
            }
        });





    }
}
