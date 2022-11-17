package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingActivity extends AppCompatActivity {
    private ImageView balik;
    private Button ganti_foto;
    private Button ganti_password;
    private TextView nama, email, password;
    private CircleImageView peee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        balik = findViewById(R.id.btnBalik);
        ganti_foto = findViewById(R.id.btnGanti_foto);
        ganti_password = findViewById(R.id.btnGanti_password);
        nama = findViewById(R.id.tvNama);
        email = findViewById(R.id.tvEmail);
        password = findViewById(R.id.tvPassword);
        peee = findViewById(R.id.pp);
        String usernamee = getIntent().getExtras().getString("username");
        String pass = getIntent().getExtras().getString("password");
        String uri = getIntent().getExtras().getString("foto_profil");

        nama.setText(usernamee);
        password.setText(pass);
        email.setText(usernamee +"@email.com");
        peee.setImageURI(Uri.parse(uri));
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, HomeChatActivity.class);
                startActivity(intent);
            }
        });
        ganti_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viee) {
                Intent intent = new Intent(SettingActivity.this, ProfilePicActivity.class);
                startActivity(intent);
            }
        });
        ganti_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viee) {
                Intent intent = new Intent(SettingActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}