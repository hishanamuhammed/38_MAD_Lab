package com.example.mad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView T1;
    private EditText E1,E2;
    private Button B1;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=(TextView) findViewById(R.id.etxt);
        E1=(EditText) findViewById(R.id.etName);
        E2=(EditText) findViewById(R.id.etpass);
        B1=(Button) findViewById(R.id.button);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=E1.getText().toString();
                password=E2.getText().toString();
                if(username.equals("Hishana") && password.equals("123"))
                {
                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}