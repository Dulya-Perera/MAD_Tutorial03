package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText1 = (EditText) findViewById(R.id.editText);
        String number1 = editText1.getText().toString();
        intent.putExtra("number1", number1);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();
        intent.putExtra("number2", number2);

        startActivity(intent);
    }
}
