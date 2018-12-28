package com.example.adrien.myapplication.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonSignUpActivity (View v) {
        Intent myIntent = new Intent(getBaseContext(), RegisterActivity.class);
        startActivity(myIntent);
    }

    public void onButtonSignIn (View v) {
        Intent myIntent = new Intent(getBaseContext(), DashboardActivity.class);
        startActivity(myIntent);
    }
}
