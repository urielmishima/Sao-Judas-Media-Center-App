package com.anima.usjt.saojudasmediacenter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anima.usjt.saojudasmediacenter.R;

public class LoginActivity extends AppCompatActivity {

    private Button loginButtonActivityLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButtonActivityLogin = findViewById(R.id.loginButtonActivityLogin);

        loginButtonActivityLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, EstagiarioMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
