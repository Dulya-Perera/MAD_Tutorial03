package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText N1;
    private EditText N2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("number1");
        EditText boxNumber1 = findViewById(R.id.editText3);
        boxNumber1.setText(number1);

        String number2 = intent.getStringExtra("number2");
        EditText boxNumber2 = findViewById(R.id.editText4);
        boxNumber2.setText(number2);

        final TextView textView = (TextView) findViewById(R.id.textView7);

        textView.setText(number1);

        N1 = (EditText) findViewById(R.id.editText3);
        N2 = (EditText) findViewById(R.id.editText4);
       final TextView textView1 = (TextView) findViewById(R.id.textView7);

        // Addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((N1.getText().length()>0) && (N2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(N1.getText().toString());
                    double oper2 = Double.parseDouble(N2.getText().toString());
                    double result = oper1 + oper2;
                    textView1.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(SecondActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });





    }


    // a public method to perform addition
    public void doSum(View v)
    {
        // get the input numbers
        EditText editText = (EditText) findViewById(R.id.editText3);
        //String number1 = editText.getText().toString();
        int n1 = Integer.parseInt(editText.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editText4);
        //String number2 = editText2.getText().toString();
        int n2 = Integer.parseInt(editText.getText().toString());

        int sum = n1 + n2;

        TextView textView = (TextView) findViewById(R.id.textView7);

        textView.setText(n1);
    }
}
