package com.example.diaryapp.ui.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diaryapp.R;
import com.example.diaryapp.auth.Login;

public class GetStarted extends AppCompatActivity {

    //    Nim   : 10120130
    //    Nama  : Muhammad Rabbani A
    //    Kelas : IF-4

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetStarted.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}