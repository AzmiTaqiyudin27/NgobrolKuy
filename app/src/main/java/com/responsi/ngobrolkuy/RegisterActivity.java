package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText username, email, password, konfirmasi_password;
    private TextView sudah_punya_akun;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.etUsername);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        konfirmasi_password = findViewById(R.id.etKonfirmasi_password);
        register = findViewById(R.id.btnRegister);
        sudah_punya_akun = findViewById(R.id.btnSudah_punya_akun);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, HomeChatActivity.class);
                if (username.getText().toString().isEmpty()) {
                    username.setError("Username harus diisi");
                } else if (email.getText().toString().isEmpty()) {
                    email.setError("Email harus diisi");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Password harus diisi");
                }else if (konfirmasi_password.getText().toString().isEmpty()) {
                    konfirmasi_password.setError("Konfirmasi password harus diisi");
                }else if(!password.getText().toString().equals(konfirmasi_password.getText().toString())) {
                    Toast.makeText(RegisterActivity.this, "     Confrim password salah     ", Toast.LENGTH_SHORT).show();
                }else {
                    intent.putExtra("username", username.getText().toString());
                    intent.putExtra("email", email.getText().toString());
                    intent.putExtra("password", password.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}