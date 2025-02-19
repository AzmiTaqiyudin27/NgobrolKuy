package com.responsi.ngobrolkuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import javax.security.auth.login.LoginException;

public class ConfirmChangePasswordActivity extends AppCompatActivity {
    private ImageView balik;
    private Button ya, tidak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_change_password);

        balik = findViewById(R.id.btnBalik);
        ya = findViewById(R.id.btnYa);
        tidak = findViewById(R.id.btnTidak);
        String pass_baru = getIntent().getExtras().getString("password_baru");

        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmChangePasswordActivity.this, HomeChatActivity.class);
                startActivity(intent);
            }
        });

        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmChangePasswordActivity.this, HomeChatActivity.class);
                intent.putExtra("password_baru", pass_baru);
                startActivity(intent);
            }
        });

        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmChangePasswordActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}