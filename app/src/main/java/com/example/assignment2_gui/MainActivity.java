package com.example.assignment2_gui;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit=(Button) findViewById(R.id.button6);
        exit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                eixt_a();
            }

        });


        button2=(Button) findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpActivity();

            }
        });

        }

        public void openSignUpActivity(){
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
        }

        public void eixt_a()
        {
            finish();
        }
    }

