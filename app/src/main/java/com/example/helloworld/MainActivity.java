package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtFirstName, edtTxtLastName, edtTxtEmail;
    TextView txtFirstName, txtLastName, txtEmail;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        edtTxtLastName = findViewById(R.id.edtTxtLastName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
    }

    public void onClickRegister(View v){
        txtFirstName.setText("First Name: "+edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: "+edtTxtLastName.getText().toString());
        txtEmail.setText("Email: "+edtTxtEmail.getText().toString());
    }
}