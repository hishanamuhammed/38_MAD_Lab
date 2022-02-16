package com.example.mad5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t1;
    private EditText e1,e2;
    private Button b1,b2,b3,b4,b5;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.etname1);
        e2=(EditText) findViewById(R.id.etname2);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button5);
        b5=(Button) findViewById(R.id.button4);
        t1=findViewById(R.id.result);


        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String etname1=e1.getText().toString();
                                      final int n1=Integer.parseInt(etname1);
                                      String etname2=e2.getText().toString();
                                      final int n2=Integer.parseInt(etname2);

                                      result=n1+n2;
                                      t1.setText(Integer.toString(result));
                                  }
                              });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etname1=e1.getText().toString();
                final int n1=Integer.parseInt(etname1);
                String etname2=e2.getText().toString();
                final int n2=Integer.parseInt(etname2);

                result=n1-n2;
                t1.setText(Integer.toString(result));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etname1=e1.getText().toString();
                final int n1=Integer.parseInt(etname1);
                String etname2=e2.getText().toString();
                final int n2=Integer.parseInt(etname2);

                result=n1*n2;
                t1.setText(Integer.toString(result));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etname1=e1.getText().toString();
                final int n1=Integer.parseInt(etname1);
                String etname2=e2.getText().toString();
                final int n2=Integer.parseInt(etname2);

                result=n1/n2;
                t1.setText(Integer.toString(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etname1=e1.getText().toString();
                final int n1=Integer.parseInt(etname1);
                String etname2=e2.getText().toString();
                final int n2=Integer.parseInt(etname2);

                result=n1%n2;
                t1.setText(Integer.toString(result));
            }
        });
    }

}