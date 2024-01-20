package com.example.learnapp_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;
    EditText etUser;
    EditText etPass;
    Button btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialiser les composants
        etUser = findViewById(R.id.email);
        etPass = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        //ajoute un listener sur le bouton
        btnLogin.setOnClickListener(v -> {
            String user = etUser.getText().toString();
            String pass = etPass.getText().toString();
            if(user.equals("abcd") && pass.equals("EFGH")){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle b = new Bundle();
                b.putString("user", user);
                b.putString("pass", pass);
                intent.putExtras(b);
                startActivity(intent);

                Log.e("btnLogin", "Login Success");
                Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
            }else{
                Log.e("btnLogin", "Login Failed");
                Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();
            }

        });
    }
}