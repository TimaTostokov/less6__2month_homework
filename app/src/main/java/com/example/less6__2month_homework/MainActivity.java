package com.example.less6__2month_homework;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btn_voiti);
        TextView tvClickMe = findViewById(R.id.tv_click);
        TextView tvForget = findViewById(R.id.tv_forget_pasword);
        TextView tvOrRegister = findViewById(R.id.tv_or_register);
        EditText etPassword = findViewById(R.id.ed_password);
        TextView tvInto = findViewById(R.id.tv_vhodd);
        EditText etEmail = findViewById(R.id.et_email);
        TextView join = findViewById(R.id.join);

        etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etEmail.getText().toString().isEmpty()) {
                    btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etPassword.getText().toString().isEmpty()) {
                    btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin")) {
                    etEmail.setVisibility(View.GONE);
                    etPassword.setVisibility(View.GONE);
                    tvClickMe.setVisibility(View.GONE);
                    tvInto.setVisibility(View.GONE);
                    tvClickMe.setVisibility(View.GONE);
                    tvForget.setVisibility(View.GONE);
                    tvOrRegister.setVisibility(View.GONE);
                    btnNext.setVisibility(View.GONE);
                    join.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}