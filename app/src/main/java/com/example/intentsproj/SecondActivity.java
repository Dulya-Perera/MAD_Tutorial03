package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private EditText n1, n2;
    private Button add, sub, mul, div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("number1");
        String number2 = intent.getStringExtra("number2");

        n1 = (EditText) findViewById(R.id.editText3);
        n2 = (EditText) findViewById(R.id.editText4);
        add = (Button) findViewById(R.id.button2);
        sub = (Button) findViewById(R.id.button3);
        mul = (Button) findViewById(R.id.button4);
        div = (Button) findViewById(R.id.button5);
        result = (TextView) findViewById(R.id.textView7);

        n1.setText(number1);
        n2.setText(number2);

    }

    public void doSum(View view)
    {
        Toast.makeText(getApplicationContext(), "Clicked +", Toast.LENGTH_SHORT).show();

        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int sum = a + b;

        StringBuilder output = new StringBuilder();
        output.append("Answer: ");
        output.append(num1 + "+" + num2 + "= ");
        output.append(sum);
        result.setText(output);
    }

    public void doSub(View view)
    {
        Toast.makeText(getApplicationContext(), "Clicked -", Toast.LENGTH_SHORT).show();

        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int sub = a - b;

        StringBuilder output = new StringBuilder();
        output.append("Answer: ");
        output.append(num1 + " - " + num2 + " = ");
        output.append(sub);
        result.setText(output);
    }

    public void doMul(View view)
    {
        Toast.makeText(getApplicationContext(), "Clicked *", Toast.LENGTH_SHORT).show();

        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int mul = a * b;

        StringBuilder output = new StringBuilder();
        output.append("Answer: ");
        output.append(num1 + " * " + num2 + " = ");
        output.append(mul);
        result.setText(output);
    }

    public void doDiv(View view)
    {
        Toast.makeText(getApplicationContext(), "Clicked /", Toast.LENGTH_SHORT).show();

        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int div = a / b;

        StringBuilder output = new StringBuilder();
        output.append("Answer: ");
        output.append(num1 + " / " + num2 + " = ");
        output.append(div);
        result.setText(output);
    }
}
