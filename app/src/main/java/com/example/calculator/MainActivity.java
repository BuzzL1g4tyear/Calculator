package com.example.calculator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
    }

    Toast toast;

    public boolean checkFields(EditText n1,EditText n2){
        boolean boo = true;

        if(n1.getText().toString().equals("")||n2.getText().toString().equals("")){
            toast=Toast.makeText(MainActivity.this,"Вы не ввели числа",Toast.LENGTH_SHORT);
            toast.show();
            toast.cancel();
            boo=false;
        }else {
            toast = Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_SHORT);
            toast.show();
            toast.cancel();
        }
        return boo;
    }

    public void onPlusClick(View view){
        EditText value1 = (EditText) findViewById(R.id.num1);
        EditText value2 = (EditText) findViewById(R.id.num2);

        TextView res = (TextView) findViewById(R.id.result);
        TextView znak = (TextView) findViewById(R.id.znak);

        if(checkFields(value1,value2)){
            int num1 = Integer.parseInt(value1.getText().toString());
            int num2 = Integer.parseInt(value2.getText().toString());
            int result = num1+num2;
            znak.setText("+");
            res.setText("="+Integer.toString(result));
        }
    }
    public void onMinClick(View view){
        EditText value1 = (EditText) findViewById(R.id.num1);
        EditText value2 = (EditText) findViewById(R.id.num2);

        TextView res = (TextView) findViewById(R.id.result);
        TextView znak = (TextView) findViewById(R.id.znak);

        if(checkFields(value1,value2)){
            int num1 = Integer.parseInt(value1.getText().toString());
            int num2 = Integer.parseInt(value2.getText().toString());
            int result = num1-num2;
            znak.setText("-");
            res.setText("="+Integer.toString(result));
        }
    }
    public void onUmnClick(View view){
        EditText value1 = (EditText) findViewById(R.id.num1);
        EditText value2 = (EditText) findViewById(R.id.num2);

        TextView res = (TextView) findViewById(R.id.result);
        TextView znak = (TextView) findViewById(R.id.znak);

        if(checkFields(value1,value2)){
            int num1 = Integer.parseInt(value1.getText().toString());
            int num2 = Integer.parseInt(value2.getText().toString());
            int result= num1*num2;
            znak.setText("*");
            res.setText("="+Integer.toString(result));
        }
    }
    public void onRazClick(View view){
        EditText value1 = (EditText) findViewById(R.id.num1);
        EditText value2 = (EditText) findViewById(R.id.num2);

        TextView res = (TextView) findViewById(R.id.result);
        TextView znak = (TextView) findViewById(R.id.znak);

        if(checkFields(value1,value2)){
            int num1 = Integer.parseInt(value1.getText().toString());
            int num2 = Integer.parseInt(value2.getText().toString());
            int result = num1/num2;
            znak.setText("/");
            res.setText("="+Integer.toString(result));
        }
    }
}