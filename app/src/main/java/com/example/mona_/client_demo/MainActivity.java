package com.example.mona_.client_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button InstaLogin = (Button)findViewById(R.id.button_Insta);

        InstaLogin.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(),AuthorizationActivity.class);
                        startActivity(myIntent);
                        Toast.makeText(MainActivity.this, "Please Enter Login Details", Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }
}
