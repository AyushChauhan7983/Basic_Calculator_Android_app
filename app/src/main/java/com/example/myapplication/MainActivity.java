package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsubt,btnmul,btndiv,btnclr,btndot,btneq;
    EditText editText;
    float res1;
    Boolean add,subt,mul,div;

    void storepre()
    {
        res1 = Float.parseFloat(editText.getText()+"");
    }
    void setfalse()
    {
        add=subt=mul=div=false;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnadd = findViewById(R.id.buttonadd);
        btnsubt = findViewById(R.id.buttonsubt);
        btnmul = findViewById(R.id.buttonmul);
        btndiv = findViewById(R.id.buttondiv);
        btndot = findViewById(R.id.buttondot);
        btnclr = findViewById(R.id.buttonclr);
        btneq = findViewById(R.id.buttoneq);
        editText = findViewById(R.id.res);

        btn1.setOnClickListener(v -> editText.setText(editText.getText() + "1"));

        btn2.setOnClickListener(v -> editText.setText(editText.getText() + "2"));

        btn3.setOnClickListener(v -> editText.setText(editText.getText() + "3"));

        btn4.setOnClickListener(v -> editText.setText(editText.getText() + "4"));

        btn5.setOnClickListener(v -> editText.setText(editText.getText() + "5"));

        btn6.setOnClickListener(v -> editText.setText(editText.getText() + "6"));

        btn7.setOnClickListener(v -> editText.setText(editText.getText() + "7"));

        btn8.setOnClickListener(v -> editText.setText(editText.getText() + "8"));

        btn9.setOnClickListener(v -> editText.setText(editText.getText() + "9"));

        btn0.setOnClickListener(v -> editText.setText(editText.getText() + "0"));

        btndot.setOnClickListener(v -> editText.setText(editText.getText() + "."));

        btnadd.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString()))
            {
                Toast.makeText(this, "EditText is empty!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                storepre();
                setfalse();
                add=true;
                editText.setText(null);
            }
        });

        btnsubt.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString()))
            {
                Toast.makeText(MainActivity.this, "EditText is empty!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                storepre();
                setfalse();
                subt=true;
                editText.setText(null);
            }
        });

        btnmul.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString()))
            {
                Toast.makeText(this, "EditText is empty!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                storepre();
                setfalse();
                mul=true;
                editText.setText(null);
            }
        });

        btndiv.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString()))
            {
                Toast.makeText(this, "EditText is empty!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                storepre();
                setfalse();
                div=true;
                editText.setText(null);
            }
        });

        btneq.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString()))
            {
                Toast.makeText(this, "EditText is empty!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if (add)
                {
                    editText.setText((res1+(Float.parseFloat(editText.getText()+""))+""));
                    add=false;
                }
                else if (subt)
                {
                    editText.setText((res1-(Float.parseFloat(editText.getText()+""))+""));
                    subt=false;
                }
                else if (mul)
                {
                    editText.setText((res1*(Float.parseFloat(editText.getText()+""))+""));
                    mul=false;
                }
                else if(div)
                {
                    editText.setText((res1/(Float.parseFloat(editText.getText()+""))+""));
                    div=false;
                }
            }

        });

       btnclr.setOnClickListener(v -> {
           editText.setText("");
           setfalse();
       });

    }
}