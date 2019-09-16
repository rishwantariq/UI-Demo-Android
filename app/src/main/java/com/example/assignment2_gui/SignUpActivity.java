package com.example.assignment2_gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private Button proceed;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        exit=(Button)findViewById(R.id.button6);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                closeFrag();
            }

        }

        );

       proceed=(Button)findViewById(R.id.button7);
      proceed.setOnClickListener(new View.OnClickListener() {
       @Override
         public void onClick(View view) {
              openFragment();
            }
        });

   }

    public void openFragment(){
       Intent intent2 = new Intent(this,TabActivity.class);
        startActivity(intent2);
   }

   public void closeFrag()
   {
       finish();

   }


}
