package com.example.introductionfindviewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStarted(View view) {
        TextView txtMessage = (TextView) findViewById(R.id.txtWelcome);
        txtMessage.setText("Let's get started!");
    }
}