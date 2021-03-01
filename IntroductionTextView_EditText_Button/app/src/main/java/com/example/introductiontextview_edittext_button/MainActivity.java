package com.example.introductiontextview_edittext_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername;
    EditText edtPassword;
    TextView txtResult;
    Button   btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
    }

    private void addControl() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        txtResult   = findViewById(R.id.txtResult);
        btnLogin    = findViewById(R.id.btnLogin);
    }

    public void Login(View view) {
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();
        txtResult.setText("Your username: " + username + "\n" + "Your password: " + password);
    }
}