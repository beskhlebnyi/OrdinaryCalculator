package com.example.cadet.ordinarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub,
            btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear, btn10;
    EditText ed1;
    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision, mDot ;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.about_menu_id:
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ordinary calculator by Beskhlebnyi", Toast.LENGTH_SHORT);
            toast.show();
            return(true);
        case R.id.convertor_menu_id:

            return(true);
        case R.id.exit_menu_id:
            finish();
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = (EditText) findViewById(R.id.edText1);
        ed1.requestFocus();
        ed1.setShowSoftInputOnFocus(false);

        btn_clear = findViewById(R.id.btn_clear);
        btn_dec = findViewById(R.id.btn_dec);
        btn_calc = findViewById(R.id.btn_calc);
        btn_Mul = findViewById(R.id.btn_Mul);
        btn_Div = findViewById(R.id.btn_Div);
        btn_Sub = findViewById(R.id.btn_Sub);
        btn_Add = findViewById(R.id.btn_Add);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn10 = findViewById(R.id.btn_9);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.0");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "0");
                    }
                }
            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.1");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "1");
                    }
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.2");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "2");
                    }
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.3");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "3");
                    }
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.4");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "4");
                    }
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.5");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "5");
                    }
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.6");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "6");
                    }
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.7");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "7");
                    }
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.8");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "8");
                    }
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if (ed1.getText().toString().equals("0")) {
                        ed1.setText("0.9");
                        mDot = true;
                    } else {
                        ed1.setText(ed1.getText() + "9");
                    }
                }
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("")) {
                    ed1.setText("0.");
                    mDot = true;
                } else
                    if(mDot == false){
                        ed1.setText(ed1.getText()+".");
                        mDot = true;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.getText().clear();
                mDot = false;
            }
        });


        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if ((ed1.getText().toString().equals("")) || (mMultiplication == true)) {
                        mMultiplication = false;
                    } else {
                        Value1 = Float.parseFloat(ed1.getText() + "");
                        mMultiplication = true;
                        ed1.setText(null);
                        mDot = false;
                    }
                }
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if ((ed1.getText().toString().equals("")) || (mAddition == true)) {
                        mAddition = false;
                    } else {
                        Value1 = Float.parseFloat(ed1.getText() + "");
                        mAddition = true;
                        ed1.setText(null);
                        mDot = false;
                    }
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if ((ed1.getText().toString().equals("")) || (mDivision == true)) {
                        mDivision = false;
                    } else {
                        Value1 = Float.parseFloat(ed1.getText() + "");
                        mDivision = true;
                        ed1.setText(null);
                        mDot = false;
                    }
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ed1.getText().toString().equals("∞")) {
                    if ((ed1.getText().toString().equals("")) || (mSubtract == true)) {
                        mSubtract = false;
                    } else {
                        Value1 = Float.parseFloat(ed1.getText() + "");
                        mSubtract = true;
                        ed1.setText(null);
                        mDot = false;
                    }
                }
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!ed1.getText().toString().equals("")) && (!ed1.getText().toString().equals("∞"))){
                    Value2 = Float.parseFloat(ed1.getText() + "");


                    if (mSubtract == true) {
                        ed1.setText(Value1 - Value2 + "");
                        mSubtract = false;
                        mDot=true;
                    }

                    if (mAddition == true) {
                        ed1.setText(Value1 + Value2 + "");
                        mAddition = false;
                        mDot=true;
                    }

                    if (mMultiplication == true) {
                        ed1.setText(Value1 * Value2 + "");
                        mMultiplication = false;
                        mDot=true;                    }

                    if (mDivision == true) {
                        if (Value2 == 0) {
                            ed1.setText("∞");
                        } else {
                            ed1.setText(Value1 / Value2 + "");
                        }
                        mDivision = false;
                        mDot = true;

                    }
                }


            }
        });

    }


}
